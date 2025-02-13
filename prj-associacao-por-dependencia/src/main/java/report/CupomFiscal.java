package report;

import domain.ItemDeVenda;
import domain.Venda;

public class CupomFiscal {
    //private Venda venda; //Exemplo de associação simples
    //A associação por dependência se faz pela passagem de parâmetro de um método
    public static String gerarCupom(Venda venda) {
        StringBuilder sb = new StringBuilder();
        sb.append("**** CUPOM FISCAL ****").append("\n");
        sb.append("Número: ").append(venda.getId()).append(" - ").append(venda.getData()).append("\n");
        sb.append("======================================\n");
        sb.append(" ********** ITENS DA VENDA ********** \n");
        sb.append("item\tdescricao\t\tqtd\tvalor\n");
        for (ItemDeVenda itemDeVenda : venda.getItensDeVenda()) {
            sb.append(itemDeVenda.getId()).append("\t").append(itemDeVenda.getProduto().getDescricao())
                    .append("\t\t").append(itemDeVenda.getQuantidade()).append("\t")
                    .append(itemDeVenda.getValor()).append("\n");
        }
        sb.append("======================================\n");
        sb.append("Total\t\t\t\t\t").append(venda.getValor()).append("\n");
        sb.append("Grato pela preferência.... volte sempre!!!\n");
        return sb.toString();
    }
}
