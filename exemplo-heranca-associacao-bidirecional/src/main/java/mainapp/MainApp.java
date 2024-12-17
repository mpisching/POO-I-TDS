package mainapp;


import domain.*;

import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria();
        categoria1.setId(1);
        categoria1.setDescricao("Instrumentos musicais");

        Produto produto1 = new Produto();
        produto1.setId(1);
        produto1.setNome("Piano");
        produto1.setDescricao("Piano de cauda");
        produto1.setPreco(new BigDecimal(120000));
        produto1.setCategoria(categoria1);

        Produto produto2 = new Produto(2, "Flauta", "Flauta Transversal",
                new BigDecimal(250.0), categoria1 );

        Produto produto3 = new Produto(3, "Violão", "Violão acústico",
                new BigDecimal(1550.0), categoria1 );

        print(produto1);
        produto1.getEstoque().setQtdMaxima(1000);
        produto1.getEstoque().setQtdMinima(10);
        produto1.getEstoque().repor(500);
        produto1.getEstoque().repor(100);
        produto1.getEstoque().setSituacao(ESituacao.ATIVO);
        print(produto1);

        //Fornecador fornecedor = new Fornecedor();
        Nacional fornecedorNacional = new Nacional();
        fornecedorNacional.setId(1);
        fornecedorNacional.setNome("ABC Nacional");
        fornecedorNacional.setEmail("abc@contato.com");
        fornecedorNacional.setFone("123321");
        fornecedorNacional.setCnpj("343433434");

        fornecedorNacional.add(produto1);
        fornecedorNacional.add(produto3);

        print(fornecedorNacional, true);

        Internacional fornecedorInternacional = new Internacional();
        fornecedorInternacional.setId(2);
        fornecedorInternacional.setNome("ABC Interncional");
        fornecedorInternacional.setEmail("abc@contato.com");
        fornecedorInternacional.setFone("123321");
        fornecedorInternacional.setNif("343433434");
        fornecedorInternacional.setPais("Argentina");

        fornecedorInternacional.add(produto2);

        print(fornecedorInternacional, true);

        print(produto1);
        print(produto2);
        print(produto3);
    }

    public static void print(Fornecedor fornecedor) {
        System.out.println("Tipo de Fornecedor - " + fornecedor.getClass().getSimpleName());
        System.out.println(fornecedor.getDados());
    }

    public static void print(Fornecedor fornecedor, boolean comProduto) {
        System.out.println("Tipo de Fornecedor - " + fornecedor.getClass().getSimpleName());
        System.out.println(fornecedor.getDados());
        if (comProduto) {
            System.out.println(fornecedor.getDadosProdutos());
        }
    }

    public static void print(Produto produto) {
        System.out.println("Produto");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Categoria: " + produto.getCategoria().getDescricao());
        System.out.println("Estoque: " + produto.getEstoque().getQuantidade());
        System.out.println("Situacao do estoque: " +
                produto.getEstoque().getSituacao());
        if (produto.getFornecedor() != null) {
            System.out.println("Fornecedor: " + produto.getFornecedor().getNome());
        } else{
            System.out.println("Fornecedor não encontrado");
        }
    }

}