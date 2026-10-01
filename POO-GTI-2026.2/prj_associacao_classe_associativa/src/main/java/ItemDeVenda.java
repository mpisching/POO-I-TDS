public class ItemDeVenda {

    private int id;
    private int quantidade;
    private double valor;

    private Venda venda;

    private Produto produto;

    public ItemDeVenda(int id, int quantidade, double valor, Venda venda, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.valor = valor;
        this.venda = venda;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
