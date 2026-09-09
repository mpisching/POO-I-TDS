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

        //print(categoria1);
        //print(categoria2);
        print(produto1);
        print(produto2);
        print(produto3);
        printCategoria(produto1);
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
}
