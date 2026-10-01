public class Relatorio {

    //a instrução abaixo não caracteriza a associação por dependência (linha pontilhada no diagrama)
    //private Cliente cliente; // uma associação simples unidirecional


    //associação por denpendência está na passagem do parâmetro para o método,
    // relacionando a classe Relatorio com a classe Cliente (por denpendência)
    //Neste tipo de associação a classe Relatório não mantem um objeto do tipo cliente
    // na relação. A classe Relatório não vai gerenciar a existência do objeto Cliente, pois não
    // é um atributo de classe
    public String imprimir(Cliente cliente) {
        StringBuilder dados = new StringBuilder();
        dados.append("Relatório do cliente").append("\n");
        dados.append("Nome........: ").append(cliente.getNome()).append("\n");
        dados.append("CPF.........: ").append(cliente.getCpf()).append("\n");
        return dados.toString();
    }

}
