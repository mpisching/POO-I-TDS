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
        produto2.getEstoque().setSituacao(ESituacao.INATIVO);
        try {
            produto2.getEstoque().repor(100);
        } catch (IllegalArgumentException exc) {
            System.out.println("Erro: " + exc.getMessage() + " do produto " + produto2.getNome());
        }

        Fornecedor fornecedor1 = new Fornecedor(1, "IFSC", "contato@ifsc.edu.br", "4899993993");
        Fornecedor fornecedor2 = new Fornecedor(2, "Eletrons", "contato@eletrons.com.br", "4894343993");

        Produto produto3 = new Produto(
                3, "Tablet", "Tablet com caneta",
                2000, categoria1, fornecedor2, 40, 400);
        produto3.getEstoque().repor(20);

        fornecedor1.add(produto1);
        fornecedor1.add(produto2);

        Cliente cliente1 = new Cliente(1, "Francisco", "4323443344");
        Cliente cliente2 = new Cliente(2, "Fátima", "2343243224");

        Relatorio relatorio = new Relatorio();

        System.out.println(relatorio.imprimir(cliente1));

        System.out.println(relatorio.imprimir(cliente2));

        //registro de uma venda
        Venda venda1 = new Venda(1, "30/09/2026", cliente1);
        ItemDeVenda item1 = new ItemDeVenda(1, 1, produto1.getPreco(), venda1, produto1);
        venda1.add(item1);
        ItemDeVenda item2 = new ItemDeVenda(1, 1, produto2.getPreco(), venda1, produto2);
        venda1.add(item2);

        System.out.println("Total da venda: " + venda1.calcularTotal());

        CupomFiscal cf = new CupomFiscal();
        System.out.println(cf.imprimir(venda1));


    }

    public static void print(Produto produto) {
        System.out.println("Estoque do Produto " + produto.getNome());
        System.out.println("Situação do estoque..: " + produto.getEstoque().getSituacao());
        System.out.println("Quantidade atual.....: " + produto.getEstoque().getQuantidade());
        System.out.println("Quantidade máxima....: " + produto.getEstoque().getQtdMaxima());
        System.out.println("Quantidade mínima....: " + produto.getEstoque().getQtdMinima());

    }
}
