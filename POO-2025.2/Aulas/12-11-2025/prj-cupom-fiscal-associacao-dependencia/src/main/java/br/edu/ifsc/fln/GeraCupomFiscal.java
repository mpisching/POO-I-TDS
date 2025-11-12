package br.edu.ifsc.fln;

public class GeraCupomFiscal {
    //private CupomFiscal cupomFiscal;
    public String gerarCupom(CupomFiscal cf) {
        StringBuilder cupom = new StringBuilder();
        cupom.append("Cupom Fiscal Nº: ").append(cf.getNumero()).append("\n");
        cupom.append("Data: ").append(cf.getData().toString()).append("\n");
        cupom.append("Cliente: ").append(String.valueOf(cf.getCliente().getNome())).append("\n");
        cupom.append("========================================\n");
        cupom.append("Item\tProduto\tQuantidade\tValor Unt\tValor\n");
        cupom.append("========================================\n");
        int i = 0;
        for (ItemDoCupom itemDoCupom : cf.getItensDoCupom()) {
            cupom.append(++i).append("\t\t").append(itemDoCupom.getProduto().getNome()).
                    append("\t\t").append(itemDoCupom.getQuantidade()).append("\t\t").
                    append(itemDoCupom.getValorDeVenda()).append("\t\t").
                    append(itemDoCupom.calcularTotalItem()).append("\n");
        }
        cupom.append("========================================\n");
        cupom.append("Total: \t\t\t\t\t\t\t").append(cf.calcularValorTotal()).append("\n");
        cupom.append("========================================\n");
        return cupom.toString();
    }
}
