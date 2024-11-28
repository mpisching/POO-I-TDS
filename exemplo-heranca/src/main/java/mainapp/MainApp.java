package mainapp;

import domain.Internacional;
import domain.Nacional;

public class MainApp {
    public static void main(String[] args) {
        Nacional fornecedorNacional = new Nacional();
        fornecedorNacional.setId(1);
        fornecedorNacional.setNome("ABC Nacional");
        fornecedorNacional.setEmail("abc@contato.com");
        fornecedorNacional.setFone("123321");
        fornecedorNacional.setCnpj("343433434");
        printFornecedorNacional(fornecedorNacional);

        Internacional fornecedorInternacional = new Internacional();
        fornecedorInternacional.setId(2);
        fornecedorInternacional.setNome("ABC Interncional");
        fornecedorInternacional.setEmail("abc@contato.com");
        fornecedorInternacional.setFone("123321");
        fornecedorInternacional.setNif("343433434");
        fornecedorInternacional.setPais("Argentina");
        printFornecedorInternacional(fornecedorInternacional);
    }

    public static void printFornecedorNacional(Nacional nacional) {
        System.out.println("Nacional");
        System.out.println("CNPJ: " + nacional.getCnpj());
        System.out.println("Nome: " + nacional.getNome());
    }

    public static void printFornecedorInternacional(Internacional internacional) {
        System.out.println("Internacional");
        System.out.println("Pais: " + internacional.getPais());
        System.out.println("NIF: " + internacional.getNif());
        System.out.println("Nome: " + internacional.getNome());
    }
}
