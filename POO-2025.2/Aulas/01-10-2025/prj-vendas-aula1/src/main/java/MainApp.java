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

        Produto p1 = new Produto(1, "Bermuda", "Ciclista", 200.0F, categoria2);
        Produto p2 = new Produto(2, "Camisa", "Camisa polo", 150.0f, categoria1);
        Produto p3 = new Produto();
        p3.setId(3);
        p3.setNome("Calça");
        p3.setDescricao("Calça jeans");
        p3.setPreco(300.0f);

        print(p1);
        print(p2);
        print(p3);


    }

    public static void print(Categoria categoria){
        System.out.println(categoria.toString());
    }

    private static void print(Produto produto) {
        System.out.println(produto.toString());
    }
}
