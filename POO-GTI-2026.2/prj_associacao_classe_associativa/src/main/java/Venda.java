import java.util.ArrayList;
import java.util.List;

public class Venda {

    private int id;
    private String data;
    private double valor;

    private Cliente cliente;

    private List<ItemDeVenda> itens = new ArrayList<>();

    public Venda(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public Venda(int id, String data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }

    public Venda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void add(ItemDeVenda item) {
        itens.add(item);
        item.setVenda(this);
    }

    public List<ItemDeVenda> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemDeVenda item : itens) {
            total += item.getValor() * item.getQuantidade();
        }
        return total;
    }
}
