import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args) {

        Categoria categoria1 = new Categoria();
        categoria1.setId(1);
        categoria1.setDescricao("Eletrônicos");
        Categoria categoria2 = new Categoria(2, "Eletrodomésticos");

        Produto produto1 = new Produto();
        produto1.setId(1);
        produto1.setNome("Celular");
        produto1.setDescricao("Celular 7\"");
        produto1.setPreco(new BigDecimal(1200.0));
        produto1.setCategoria(categoria1);
        Produto produto2 = new Produto(
                2, "Geladeira", "Geladeira Frost Free",
                new BigDecimal(3200.0));
        produto2.setCategoria(categoria2);

        Produto produto3 = new Produto(3, "TV", "TV plana qled",
                new BigDecimal(2300.0), categoria1);

        Fornecedor fornecedor1 = new Fornecedor(1, "IFSC", "contato@ifsc.edu.br", "48999948847");
        try {
            fornecedor1.add(produto1);
            fornecedor1.add(produto3);
        } catch(RuntimeException exc) {
            System.out.println(exc.getMessage());
        }

        Fornecedor fornecedor2 = new Fornecedor(2, "UFSC", "contato@ufsc.edu.br", "4839393999");
        try {
            fornecedor2.add(produto2);
            fornecedor2.add(produto3);
        } catch(RuntimeException exc) {
            System.out.println(exc.getMessage());
        }

        Fornecedor fornecedor3 = new Fornecedor(3, "SENAC", "contato@senac.com.br", "34343343");

        print(fornecedor1);
        print(fornecedor2);
        print(fornecedor3);

        //transferencia de produto
        fornecedor1.transferir(fornecedor3, produto3);
        print(fornecedor1);
        print(fornecedor3);

        //print(categoria1);
        //print(categoria2);
        print(produto2);
//        print(produto1);
//        print(produto3);
//        printCategoria(produto1);
    }

    public static void print(Categoria categoria){
        System.out.println("Dados da categoria:");
        System.out.println(categoria.toString());
    }

    public static void print(Produto produto){
        System.out.println("**** Dados do Produto ****");
        System.out.println(produto.toString());
    }

    public static void printCategoria(Produto produto) {
        System.out.println("Nome: " +  produto.getNome());
        System.out.println("Categoria: " +  produto.getCategoria().getDescricao());
    }

    public static void print(Fornecedor fornecedor) {
        System.out.println(fornecedor.getDados());
    }

}
