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

        Produto produto3 = new Produto(3, "Tablet", "Tablet com caneta",
                2000, categoria1);

        Fornecedor fornecedor1 = new Fornecedor(1, "IFSC", "contato@ifsc.edu.br", "4899993993");
        Fornecedor fornecedor2 = new Fornecedor(2, "Eletrons", "contato@eletrons.com.br", "4894343993");

        fornecedor1.add(produto1);
        fornecedor1.add(produto3);

        System.out.println("Nome do fornecedor do produto 1: " +
                produto1.getFornecedor().getNome());

        //println(categoria1);
        //println(categoria2);
//        println(produto1);
//        println(produto2);
//        println(produto3);

        //println(fornecedor1);

        println(fornecedor1.getDados());

        fornecedor1.remove(produto3);
//        println("depois da remoção...");
//        println(fornecedor1);

        println(fornecedor1.getDados());

    }
}
