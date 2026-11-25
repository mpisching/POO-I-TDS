package br.edu.ifsc.fln.domain;

import br.edu.ifsc.fln.exceptions.VendaException;

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
       A classe br.edu.ifsc.fln.domain.Venda não conhece diretamente os seus produtos, ela conhece de fato os itens de venda
     */
    //private List<br.edu.ifsc.fln.domain.Produto> produtos = new ArrayList<>();
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

//    public BigDecimal getValor()  {
//        return totalVenda();
//    }

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

    public List<ItemDeVenda> getItensDeVenda() {
        return itensDeVenda;
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

    public BigDecimal totalVenda() throws VendaException {
        BigDecimal total = new BigDecimal(0);
        if (!itensDeVenda.isEmpty()) {
            for (ItemDeVenda item : itensDeVenda) {
                BigDecimal subTotal = item.getValor().multiply(new BigDecimal(item.getQuantidade()));
                total = total.add(subTotal);
            }
        } else {
            //lançar uma exceção não verificada
//            throw new RuntimeException("O cálculo não pode ser realizado\n" +
//                    "Não há itens de venda!");

            //lançar uma exceção verificada
//            throw new Exception("O cálculo não pode ser realizado\n" +
//                    "Não há itens de venda!");
            throw new VendaException("O cálculo não pode ser realizado\n" +
                    "Não há itens de venda!");

        }
        return total;
    }

}
