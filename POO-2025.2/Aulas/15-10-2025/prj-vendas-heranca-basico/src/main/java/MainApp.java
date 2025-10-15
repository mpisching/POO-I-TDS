public class MainApp {

    public static void main(String[] args) {
        Categoria categoria1 = new Categoria(1, "Camisas");
        Categoria categoria2 = new Categoria(2, "Bermudas");
        Categoria categoria3 = new Categoria();
        categoria3.setId(3);
        categoria3.setDescricao("Calça");

//        print(categoria1);
//        print(categoria2);
//        print(categoria3);

//        Estoque estoque1 = new Estoque();
//        estoque1.setQtdMaxima(100);
//        estoque1.setQtdMinima(10);
//        estoque1.repor(50);
//        forma incorreta de iniciar um produto com estoque sendo o conceito de composição
        //Produto p1 = new Produto(1, "Bermuda", "Ciclista", 200.0F, categoria2, estoque1);
        Produto p1 = new Produto(1, "Bermuda", "Ciclista", 200.0F, categoria2);
        Produto p2 = new Produto(2, "Camisa", "Camisa polo", 150.0f, categoria1, 500, 10, 200);
        Produto p3 = new Produto();
        p3.setId(3);
        p3.setNome("Calça");
        p3.setDescricao("Calça jeans");
        p3.setPreco(300.0f);

//        print(p1);
//        print(p2);
//        print(p3);

        //para a composição, a instanciação de Estoque é indesejável
//        Estoque estoque1 = new Estoque();
//        estoque1.setQtdMaxima(100);
//        estoque1.setQtdMinima(10);
//        estoque1.repor(50);

        //p1 = null;
        p1.getEstoque().setQtdMaxima(300);
        p1.getEstoque().setQtdMinima(50);
        p1.getEstoque().setSituacao(ESituacao.ATIVO);
        try {
            p1.getEstoque().repor(250);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error: " + ex.getMessage());
        }

        printEstoque(p1);
        printEstoque(p2);
        printEstoque(p3);

    }

    public static void print(Categoria categoria){
        System.out.println(categoria.toString());
    }

    private static void print(Produto produto) {
        System.out.println(produto.toString());
    }

    private static void printEstoque(Produto produto){
        System.out.println("Nome: " +  produto.getNome());
        System.out.println("Situação do estoque: " + produto.getEstoque().getSituacao().getDescricao());
        System.out.println("Quantidade: " + produto.getEstoque().getQuantidade());
    }
}
