import java.math.BigDecimal;
import java.time.LocalDate;

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
//        Estoque estoque = new Estoque(1000, 100);
        Produto produto4 = new Produto(4, "Fogão", "Fogão 5 bocas", new BigDecimal(1101.0),
                categoria2, 1000, 100);
        produto4.getEstoque().setSituacao(ESituacao.INATIVO);
        //if (produto4.getEstoque().getSituacao() == ESituacao.ATIVO) {
        try {
            produto4.getEstoque().repor(30);
            produto4.getEstoque().retirar(15);
        } catch (RuntimeException ex) {
            System.out.println("Falha: " + ex.getMessage());
        }
        //}

        Fornecedor fornecedor1 = new Nacional(1, "IFSC", "contato@ifsc.edu.br", "48999948847", "58588585858");
        try {
            fornecedor1.add(produto1);
            fornecedor1.add(produto3);
        } catch(RuntimeException exc) {
            System.out.println(exc.getMessage());
        }

        Relatorio.imprimir(fornecedor1);

        Fornecedor fornecedor2 = new Internacional(2, "UFSC", "contato@ufsc.edu.br", "4839393999", "França", "33434");
        fornecedor2 = fornecedor1;

        Nacional fn = new Nacional();
        Internacional fi = new Internacional();

        try {
            fornecedor2.add(produto2);
            fornecedor2.add(produto3);
        } catch(RuntimeException exc) {
            System.out.println(exc.getMessage());
        }

        Relatorio.imprimir(fornecedor2);

        Fornecedor fornecedor3 = new Nacional(3, "SENAC", "contato@senac.com.br", "34343343", "84838483");

        Nacional nacional = new Nacional(
                4, "Brasil Express", "contato@brasilexpress.com.br", "33434343", "1234545000198");

        //print(nacional);

        Internacional internacional = new Internacional(
                5, "International Express", "contato@internationalexpress.com",
                "454533434343", "Paraguai", "342342");

        Venda.setEmpresa("Comércio IFSC LTDA.");

        //vamos as compras...
        Cliente cliente = new Cliente(1, "Lucas", "3434356755", "4893994757", "Florianópolis", LocalDate.now());
        Relatorio.imprimir(cliente);
        Venda venda1 = new Venda(1, LocalDate.now(), false, 0.0, cliente);
        venda1.add(1, produto1, 1, produto1.getPreco());
        venda1.add(2, produto2, 2, produto2.getPreco());

//        System.out.println("antes de matar a venda...");
//        System.out.println("Venda: " + venda1.getId());
//        System.out.println("Produto 1: " + produto1.getNome());
//        System.out.println("Produto 2: " + produto2.getNome());
//
//        System.out.println("depois de matar a venda...");
//        venda1 = null;
//        System.out.println("Venda: " + venda1);
//        System.out.println("Produto 1: " + produto1.getNome());
//        System.out.println("Produto 2: " + produto2.getNome());

        //System.out.println("Total da venda: " + venda1.totalVenda());
        //System.out.println(venda1.gerarCupom());
        //CupomFiscal cf = new CupomFiscal();
        //System.out.println(new CupomFiscal().gerarCupom(venda1));


        //print(internacional);
    }


    public static void printEstoque(Produto produto) {
        System.out.println("Detalhes do estoque do produto " + produto.getNome());
        System.out.println("Quantidade Atual .....: " + produto.getEstoque().getQuantidade());
        System.out.println("Quantidade Máxima ....: " + produto.getEstoque().getQtdMaxima());
        System.out.println("Quantidade Mínima ....: " + produto.getEstoque().getQtdMinima());
        System.out.println("Situação..............: " + produto.getEstoque().getSituacao().getDescricao());;

    }

}
