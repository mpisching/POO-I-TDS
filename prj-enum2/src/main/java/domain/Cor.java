package domain;

public class Cor {

    private long id;
    private String nome;

    public Cor() {
    }

    public Cor(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cor{" + "id=" + id + ", nome='" + nome + '\'' + '}';
    }
}
