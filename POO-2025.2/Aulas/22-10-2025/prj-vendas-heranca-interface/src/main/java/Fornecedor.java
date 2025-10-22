public abstract class Fornecedor implements IResumoDados {
    private int id;
    private String nome;
    private String email;
    private String fone;
    private String endereco;

    public Fornecedor() {
    }

    public Fornecedor(int id, String nome, String email, String fone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getDados() {
        StringBuilder dados = new StringBuilder();
        dados.append("Nome: " + getNome());
        dados.append("\nEmail: " + getEmail());
        dados.append("\nFone: " + getFone());
        return dados.toString();
    }

    @Override
    public String toString() {
        return super.toString() + "Fornecedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", fone='" + fone + '\'' +
                '}';
    }
}
