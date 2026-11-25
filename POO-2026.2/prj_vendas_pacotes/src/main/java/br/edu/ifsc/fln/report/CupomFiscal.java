package br.edu.ifsc.fln.report;

import br.edu.ifsc.fln.domain.ItemDeVenda;
import br.edu.ifsc.fln.domain.Venda;
import br.edu.ifsc.fln.exceptions.VendaException;

import java.math.BigDecimal;

public class CupomFiscal {
    /* Por conta relação de associação por dependência,
       a classe br.edu.ifsc.fln.report.CupomFiscal não deve declarar um
       atributo do tipo br.edu.ifsc.fln.domain.Venda.
     */
    //br.edu.ifsc.fln.domain.Venda venda;

    /**
     * Uma associação por dependência ocorre apenas na
     * passagem de parâmetro de uma referência de um
     * tipo de objeto, neste caso, br.edu.ifsc.fln.domain.Venda.
     * @param venda
     * @return
     */
    public String gerarCupom(Venda venda) throws VendaException {
        StringBuilder cupom = new StringBuilder();
        cupom.append("****** CUPOM DE VENDA ******\n");
        cupom.append("Empresa ").append(Venda.getEmpresa()).append("\n");
        cupom.append("Num: ").append(venda.getId()).append("     Data: ").append(venda.getData()).append("\n");
        cupom.append("br.edu.ifsc.fln.domain.Cliente: ").append(venda.getCliente().getNome()).append("\n");
        cupom.append("----------------------------\n");
        cupom.append("Item\tProduto\t\tQtd\tVlr Unt\tValor\n");
        int i = 0;
        for (ItemDeVenda item: venda.getItensDeVenda()) {
            BigDecimal valor = item.getValor().multiply(new BigDecimal(item.getQuantidade()));
            cupom.append(++i).append("\t").append(item.getProduto().getNome())
                    .append("\t\t").append(item.getQuantidade()).append("\t")
                    .append(item.getValor()).append("\t")
                    .append(valor).append("\n");
        }
        cupom.append("----------------------------\n");
        cupom.append("Total...........: ").append(venda.totalVenda()).append("\n");
        cupom.append("----------------------------\n");
        cupom.append("Obrigado pela preferência ... volte sempre!!!\n");
        return cupom.toString();
    }

}
