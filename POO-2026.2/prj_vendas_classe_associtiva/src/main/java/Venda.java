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
    private static String empresa;

    private Cliente cliente;

    /*
       A classe Venda não conhece diretamente os seus produtos, ela conhece de fato os itens de venda
     */
    //private List<Produto> produtos = new ArrayList<>();
    private List<ItemDeVenda> itensDeVenda = new ArrayList<>();

    private EStatusVenda statusVenda = EStatusVenda.ABERTA;

    public Venda() {
    }

    public Venda(int id, LocalDate data, boolean pago, double txDesconto) {
        this.id = id;
        this.data = data;
        this.pago = pago;
        this.txDesconto = txDesconto;
    }

    public Venda(int id, LocalDate data, boolean pago, double txDesconto, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.pago = pago;
        this.txDesconto = txDesconto;
        this.cliente = cliente;
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
        return totalVenda();
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

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

    public static String getEmpresa() {
        return empresa;
    }

    public static void setEmpresa(String empresa) {
        Venda.empresa = empresa;
    }

    public EStatusVenda getStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(EStatusVenda statusVenda) {
        this.statusVenda = statusVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     *
     *
     * @param id
     * @param produto
     * @param qtd
     * @param valorUnt
     */
    public void add(int id, Produto produto, int qtd, BigDecimal valorUnt) {
        ItemDeVenda item = new ItemDeVenda(id, qtd, valorUnt, produto);
        itensDeVenda.add(item);
        item.setVenda(this);
    }

    public BigDecimal totalVenda() {
        BigDecimal total = new BigDecimal(0);
        for (ItemDeVenda item : itensDeVenda) {
            BigDecimal subTotal = item.getValor().multiply(new BigDecimal(item.getQuantidade()));
            total = total.add(subTotal);
        }
        return total;
    }

    public String gerarCupom() {
        StringBuilder cupom = new StringBuilder();
        cupom.append("****** CUPOM DE VENDA ******\n");
        cupom.append("Empresa ").append(empresa).append("\n");
        cupom.append("Num: ").append(id).append("     Data: ").append(data).append("\n");
        cupom.append("Cliente: ").append(cliente.getNome()).append("\n");
        cupom.append("----------------------------\n");
        cupom.append("Item\tProduto\t\tQtd\tVlr Unt\tValor\n");
        int i = 0;
        for (ItemDeVenda item: itensDeVenda) {
            BigDecimal valor = item.getValor().multiply(new BigDecimal(item.getQuantidade()));
            cupom.append(++i).append("\t").append(item.getProduto().getNome())
                    .append("\t\t").append(item.getQuantidade()).append("\t")
                    .append(item.getValor()).append("\t")
                    .append(valor).append("\n");
        }
        cupom.append("----------------------------\n");
        cupom.append("Total...........: ").append(totalVenda()).append("\n");
        cupom.append("----------------------------\n");
        cupom.append("Obrigado pela preferência ... volte sempre!!!\n");
        return cupom.toString();
    }
}
