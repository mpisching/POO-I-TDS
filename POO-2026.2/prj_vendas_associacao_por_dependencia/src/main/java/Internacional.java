public class Internacional extends Fornecedor {
    private String pais;
    private String nif;

    public Internacional() {
        super();
    }

    public Internacional(int id, String nome, String email, String fone, String pais, String nif) {
        super(id, nome, email, fone);
        this.setNome(nome);
        this.pais = pais;
        this.nif = nif;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDados());
        sb.append("NIF.........: " + nif + "\n");
        sb.append("País........: " + pais + "\n");
        return sb.toString();
    }

    public String getDados(String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append(getDados());
        sb.append("Mensagem: " ).append(msg).append("\n");
        return sb.toString();
    }
}
