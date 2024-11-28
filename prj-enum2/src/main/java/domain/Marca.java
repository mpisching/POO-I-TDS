package domain;

// Classe Marca
public class Marca {

    private int id;
    private String nome;

    public Marca() {
    }

    public Marca(String nome) {
        this.nome = nome;
    }

    // Construtor
    public Marca(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return "Marca{" + "id=" + id + ", nome='" + nome + '\'' + '}';
    }
}
