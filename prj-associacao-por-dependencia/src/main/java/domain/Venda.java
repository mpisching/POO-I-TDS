package domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private LocalDate data;
    private BigDecimal valor;
    private boolean pago;
    private double txDesconto;
    private String empresa;
    private EStatusVenda status;

    //private List<Produto> produtos = new ArrayList<>();
    private List<ItemDeVenda> itensDeVenda = new ArrayList<>();

    public List<ItemDeVenda> getItensDeVenda() {
        return itensDeVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        valor = totalVenda();
        return valor;
    }

//    public void setValor(BigDecimal valor) {
//        this.valor = valor;
//    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public double getTxDesconto() {
        return txDesconto;
    }

    public void setTxDesconto(double txDesconto) {
        this.txDesconto = txDesconto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public EStatusVenda getStatus() {
        return status;
    }

    public void setStatus(EStatusVenda status) {
        this.status = status;
    }

    public BigDecimal totalVenda() {
        valor = new BigDecimal(0.0);

        for (ItemDeVenda itemDeVenda : itensDeVenda) {
//            BigDecimal valorItem = itemDeVenda.getValor();
//            BigDecimal qtd = BigDecimal.valueOf(itemDeVenda.getQuantidade());
//            BigDecimal total = valorItem.multiply(qtd);
//            this.valor = this.valor.add(total);
            valor = valor.add(itemDeVenda.getValor().multiply(BigDecimal.valueOf(itemDeVenda.getQuantidade())));
        }

        return valor;
    }

    public void add(ItemDeVenda itemDeVenda) {
        itensDeVenda.add(itemDeVenda);
        itemDeVenda.setVenda(this);
    }

//    public String gerarCupom() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("**** CUPOM FISCAL ****").append("\n");
//        sb.append("Número: ").append(this.getId()).append(" - ").append(this.getData()).append("\n");
//        sb.append("======================================\n");
//        sb.append(" ********** ITENS DA VENDA ********** \n");
//        sb.append("item\tdescricao\t\tqtd\tvalor\n");
//        for (ItemDeVenda itemDeVenda : itensDeVenda) {
//            sb.append(itemDeVenda.getId()).append("\t").append(itemDeVenda.getProduto().getDescricao())
//                    .append("\t\t").append(itemDeVenda.getQuantidade()).append("\t")
//                    .append(itemDeVenda.getValor()).append("\n");
//        }
//        sb.append("======================================\n");
//        sb.append("Total\t\t\t\t\t").append(this.getValor()).append("\n");
//        sb.append("Grato pela preferência.... volte sempre!!!\n");
//        return sb.toString();
//    }
}
