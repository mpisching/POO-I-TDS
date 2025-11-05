package br.edu.ifsc.fln;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CupomFiscal {
    private int numero;
    private LocalDate data;
    private float valorTotal;

    private List<ItemDoCupom> itensDoCupom = new ArrayList<>();

    public Cliente cliente;

    public CupomFiscal(int numero, LocalDate data,  Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void addItemDoCupom(ItemDoCupom itemDoCupom) {
        itensDoCupom.add(itemDoCupom);
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public float calcularValorTotal() {
        valorTotal = 0;
        for (ItemDoCupom item : itensDoCupom) {
            valorTotal += item.getQuantidade() * item.getValorDeVenda();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "CupomFiscal{" +
                "numero=" + numero +
                ", data=" + data +
                '}';
    }

    public String gerarCupom() {
        StringBuilder cupom = new StringBuilder();
        cupom.append("Cupom Fiscal Nº: ").append(numero).append("\n");
        cupom.append("Data: ").append(data.toString()).append("\n");
        cupom.append("Cliente: ").append(String.valueOf(cliente.getNome())).append("\n");
        cupom.append("========================================\n");
        cupom.append("Item\tProduto\tQuantidade\tValor Unt\tValor\n");
        cupom.append("========================================\n");
        int i = 0;
        for (ItemDoCupom itemDoCupom : itensDoCupom) {
            cupom.append(++i).append("\t\t").append(itemDoCupom.getProduto().getNome()).
                    append("\t\t").append(itemDoCupom.getQuantidade()).append("\t\t").
                    append(itemDoCupom.getValorDeVenda()).append("\t\t").
                    append(itemDoCupom.calcularTotalItem()).append("\n");
        }
        cupom.append("========================================\n");
        cupom.append("Total: \t\t\t\t\t\t\t").append(calcularValorTotal()).append("\n");
        cupom.append("========================================\n");
        return cupom.toString();
    }
}
