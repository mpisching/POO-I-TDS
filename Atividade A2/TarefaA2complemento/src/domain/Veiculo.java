package domain;

// Classe Veiculo
public class Veiculo {

    private int id;
    private String placa;
    private Modelo modelo;
    private Cor cor;
    private String observacoes;

    public Veiculo() {
    }

    public Veiculo(String placa) {
        this.placa = placa;
    }

    // Construtor
    public Veiculo(int id, String placa, Modelo modelo, String observacoes) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.observacoes = observacoes;
    }

    public Veiculo(int id, String placa, Modelo modelo, Cor cor, String observacoes) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.observacoes = observacoes;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", placa='" + placa + '\''
                + ", modelo='" + modelo + '\'' + ", cor='" + cor + '\''
                + ", observacoes='" + observacoes + '}';
    }
}
