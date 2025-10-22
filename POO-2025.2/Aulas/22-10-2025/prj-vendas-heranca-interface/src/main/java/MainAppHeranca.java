import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainAppHeranca {
    public static void main(String[] args) {
        List<IResumoDados> lista = new ArrayList<>();
        Cliente cliente = new Cliente(1, "Fulano", "84848484", "123123", "Rua tal", LocalDate.now());
        lista.add(cliente);
        //print(cliente);
        Fornecedor fornecedor;// = new Fornecedor(3, "Fornecedor do bem", "contato@dobem.com.br","12313213");
        //print(fornecedor);
        //Nacional nacional = new Nacional(1,"ABC", "contato@abc.com.br", "1231321","1123213112312");
        fornecedor = new Nacional(1,"ABC", "contato@abc.com.br", "1231321","1123213112312");
        //print(fornecedor);
        lista.add(fornecedor);
        //Internacional internacional = new Internacional(2, "Gremio", "contato@gremico.campeomundial.com.br", "324234234", "Paraguai","3423423");
        fornecedor = new Internacional(2, "Gremio", "contato@gremico.campeomundial.com.br", "324234234", "Paraguai","3423423");
        lista.add(fornecedor);
        //print(fornecedor);

        print(lista);
    }

    public static void print(List<IResumoDados> lista){
        for(IResumoDados resumo : lista){
            System.out.println(resumo.getDados());
        }
    }

    public static void print(IResumoDados resumo){
        System.out.println("Dados");
        System.out.println(resumo.getDados());
    }


//    public static void print(Cliente cliente) {
//        System.out.println("Dados do cliente");
//        System.out.println(cliente.getDados("Parabéns pelo seu nascimento...."));
//    }
//
//    public static void print(Fornecedor fornecedor){
//        System.out.println("Fornecedor");
//        System.out.println(fornecedor.getDados());
//    }

//    public static void print(Nacional nacional){
//        System.out.println("Fornecedor Nacional");
//        System.out.println("Dados herdados");
//        System.out.println("Nome..........: "+nacional.getNome());
//        System.out.println("Email.........: "+nacional.getEmail());
//        System.out.println("Fone..........: "+nacional.getFone());
//        System.out.println("Dados especializados");
//        System.out.println("CNPJ..........: "+nacional.getCnpj());
//        System.out.println();
//    }
//
//    public static void print(Internacional internacional){
//        System.out.println("Fornecedor Internacional");
//        System.out.println("Dados herdados");
//        System.out.println("Nome..........: "+internacional.getNome());
//        System.out.println("Email.........: "+internacional.getEmail());
//        System.out.println("Fone..........: "+internacional.getFone());
//        System.out.println("Dados especializados");
//        System.out.println("NIF...........: "+internacional.getNif());
//        System.out.println("País..........: "+internacional.getPais());
//        System.out.println();
//    }

}
