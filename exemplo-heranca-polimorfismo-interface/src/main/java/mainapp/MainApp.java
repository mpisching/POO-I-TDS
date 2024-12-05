package mainapp;


import domain.Fornecedor;
import domain.Internacional;
import domain.Nacional;

public class MainApp {
    public static void main(String[] args) {
        //Fornecador fornecedor = new Fornecedor();
        Nacional fornecedorNacional = new Nacional();
        fornecedorNacional.setId(1);
        fornecedorNacional.setNome("ABC Nacional");
        fornecedorNacional.setEmail("abc@contato.com");
        fornecedorNacional.setFone("123321");
        fornecedorNacional.setCnpj("343433434");
        //printFornecedorNacional(fornecedorNacional);
        print(fornecedorNacional);

        Internacional fornecedorInternacional = new Internacional();
        fornecedorInternacional.setId(2);
        fornecedorInternacional.setNome("ABC Interncional");
        fornecedorInternacional.setEmail("abc@contato.com");
        fornecedorInternacional.setFone("123321");
        fornecedorInternacional.setNif("343433434");
        fornecedorInternacional.setPais("Argentina");
        //printFornecedorInternacional(fornecedorInternacional);
        print(fornecedorInternacional);
    }

    public static void print(Fornecedor fornecedor) {
        System.out.println("Tipo de Fornecedor - " + fornecedor.getClass().getSimpleName());
        System.out.println(fornecedor.getDados());
//        System.out.println("ID..........: " + fornecedor.getId());
//        System.out.println("Nome........: " + fornecedor.getNome());
//        System.out.println("Email.......: " + fornecedor.getEmail());
//        System.out.println("Fone........: " + fornecedor.getFone());
//        if (fornecedor instanceof Nacional nacional) {
//            //operação downcast por meio de uma variável temporária
//            System.out.println("CNPJ........: " + nacional.getCnpj());
//        } else {
//            //operação downcast sem a necessidade de usar uma variável
//            System.out.println("Pais........: " + ((Internacional)fornecedor).getPais());
//            System.out.println("NIF.........: " + ((Internacional)fornecedor).getNif());
//        }
    }

//    public static void printFornecedorNacional(Nacional nacional) {
//        System.out.println("Nacional");
//        System.out.println("ID..........: " + nacional.getId());
//        System.out.println("Nome........: " + nacional.getNome());
//        System.out.println("Email.......: " + nacional.getEmail());
//        System.out.println("Fone........: " + nacional.getFone());
//        System.out.println("CNPJ........: " + nacional.getCnpj());
//    }
//
//    public static void printFornecedorInternacional(Internacional internacional) {
//        System.out.println("Internacional");
//        System.out.println("ID..........: " + internacional.getId());
//        System.out.println("Nome........: " + internacional.getNome());
//        System.out.println("Email.......: " + internacional.getEmail());
//        System.out.println("Fone........: " + internacional.getFone());
//        System.out.println("Pais........: " + internacional.getPais());
//        System.out.println("NIF.........: " + internacional.getNif());
//    }
}
