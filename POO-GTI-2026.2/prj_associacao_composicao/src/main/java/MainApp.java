import static java.lang.IO.print;
import static java.lang.IO.println;

public class MainApp {
    static void main(String[] args) {
        Categoria categoria1 = new Categoria();
        categoria1.setId(1);
        categoria1.setDescricao("Eletrônicos");
        Categoria categoria2 = new Categoria(2, "Eletrodomésticos");

        Produto produto1 = new Produto();
        produto1.setId(1);
        produto1.setNome("Celular");
        produto1.setDescricao("Celular Ultra Led");
        produto1.setPreco(1200.0);
        produto1.setCategoria(categoria1);


        Produto produto2 = new Produto(2, "Geladeira", "Geladeira Frost Free",
                2300.0, categoria2);

        //definindo o estoque dos produtos...
        produto1.getEstoque().setQtdMaxima(1000);
        produto1.getEstoque().setQtdMinima(10);
        try {
            produto1.getEstoque().repor(100);
        } catch (IllegalArgumentException exc) {
            System.out.println("Falha: " + exc.getMessage());
        }

        produto2.getEstoque().setQtdMinima(2000);
        produto2.getEstoque().setQtdMaxima(200000);


        Fornecedor fornecedor1 = new Fornecedor(1, "IFSC", "contato@ifsc.edu.br", "4899993993");
        Fornecedor fornecedor2 = new Fornecedor(2, "Eletrons", "contato@eletrons.com.br", "4894343993");

        //a declaração não é adequada para implementar o conceito de composição
//        Estoque estoque = new Estoque();
//        estoque.setQtdMaxima(400);
//        estoque.setQtdMinima(4);
//        estoque.repor(20);
//        Produto produto3 = new Produto(
//                3, "Tablet", "Tablet com caneta",
//                2000, categoria1, fornecedor2, estoque);

        Produto produto3 = new Produto(
                3, "Tablet", "Tablet com caneta",
                2000, categoria1, fornecedor2, 40, 400);
        produto3.getEstoque().repor(20);
//        produto3 = null;
        System.out.println("Estoque do produto3 : " + produto3.getEstoque().getQuantidade());
        System.out.println("Produto3 " + produto3.getNome());

        fornecedor1.add(produto1);
        fornecedor1.add(produto2);

        System.out.println("Nome do fornecedor do produto 1: " +
                produto1.getFornecedor().getNome());

//        Estoque estoque1 = new Estoque();//para o conceito de composição - está inválido - é errado ... não façam
//        produto1.setEstoque(estoque1);
//        produto2.setEstoque(estoque1);
//        produto1 = null;

        print(produto1);
        print(produto2);
        print(produto3);

    }

    public static void print(Produto produto) {
        System.out.println("Estoque do Produto " + produto.getNome());
        System.out.println("Quantidade atual.....: " + produto.getEstoque().getQuantidade());
        System.out.println("Quantidade máxima....: " + produto.getEstoque().getQtdMaxima());
        System.out.println("Quantidade mínima....: " + produto.getEstoque().getQtdMinima());

    }
}
