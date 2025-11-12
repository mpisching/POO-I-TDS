package br.edu.ifsc.fln;

public class ItemDoCupom {
    private float valorDeVenda;
    private int quantidade;

    private Produto produto;
    private CupomFiscal cupomFiscal;

    public ItemDoCupom(Produto produto, int quantidade) {
        this.valorDeVenda = produto.getValor();
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemDoCupom(float valorDeVenda, int quantidade, Produto produto, CupomFiscal cupomFiscal) {
        this.valorDeVenda = valorDeVenda;
        this.quantidade = quantidade;
        this.produto = produto;
        this.cupomFiscal = cupomFiscal;
    }

    public float getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(float valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public CupomFiscal getCupomFiscal() {
        return cupomFiscal;
    }

    public void setCupomFiscal(CupomFiscal cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
    }

    public float calcularTotalItem() {
        return valorDeVenda *  quantidade;
    }
}
