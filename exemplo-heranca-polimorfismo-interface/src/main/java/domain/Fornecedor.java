package domain;

public abstract class Fornecedor extends Object implements IResumoDados {
    private int id;
    private String nome;
    private String email;
    private String fone;

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

    @Override
    public String getDados() {
        StringBuilder dados = new StringBuilder();
        dados.append("ID...........: ").append(this.getId()).append("\n");
        dados.append("Nome.........: ").append(this.getNome()).append("\n");
        dados.append("Email........: ").append(this.getEmail()).append("\n");
        dados.append("Fone.........: ").append(this.getFone()).append("\n");
        return dados.toString();
    }

    @Override
    public String getDados(String msg) {
        StringBuilder dados = new StringBuilder();
        dados.append(getDados()).append("\n").append("Mensagem: ").append(msg);
        return dados.toString();
    }
}
