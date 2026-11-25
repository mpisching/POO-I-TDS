package br.edu.ifsc.fln.domain;

import java.math.BigDecimal;

public class ItemDeVenda {

    private int id;
    private int quantidade;
    private BigDecimal valor;

    private Produto produto;
    private Venda venda;

    public ItemDeVenda() {
    }

    public ItemDeVenda(int id, int quantidade, BigDecimal valor) {
        this.id = id;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public ItemDeVenda(int id, int quantidade, BigDecimal valor, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.valor = valor;
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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

}
