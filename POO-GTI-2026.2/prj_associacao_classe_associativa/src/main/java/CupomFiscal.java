public class CupomFiscal {
    public String imprimir(Venda venda) {
        StringBuilder cupom = new StringBuilder();
        cupom.append("******* Cumpom Fiscal *******\n");
        cupom.append("No: ").append(venda.getId()).append("\n");
        cupom.append("Cliente: ").append(venda.getCliente().getNome()).append("     CPF: ").append(
                venda.getCliente().getCpf()).append("\n");
        cupom.append("================================================\n");
        cupom.append("Item\tProduto\tQuantidade\tVlr Unt\tTotal\n");
        int cont = 0;
        for (ItemDeVenda item : venda.getItens()) {
            cupom.append(++cont).append("\t\t").append(item.getProduto().getNome()).append("\t\t").append(
                    item.getQuantidade()).append("\t\t").append(item.getValor()).append("\t").append(
                    (item.getValor() * item.getQuantidade())).append("\n");
        }
        cupom.append("================================================\n");
        cupom.append("TOTAL: \t\t\t\t").append(venda.calcularTotal()).append("\n");
        cupom.append("================================================\n");
        cupom.append("Obrigado pela preferência...\n");

        return cupom.toString();
    }
}
