public class Internacional extends Fornecedor {
    private String pais;
    private String nif;

    public Internacional() {
    }

    public Internacional(int id, String nome, String email, String fone, String pais, String nif) {
        super(id, nome, email, fone);
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

    @Override
    public String getDados() {
        StringBuilder dados = new StringBuilder();
        dados.append(super.getDados());
        dados.append("\nPais: " + getPais());
        dados.append("\nNIF: " + getNif());
        return dados.toString();
    }

    @Override
    public String getDados(String msg) {
        StringBuilder dados = new StringBuilder();
        dados.append(getDados());
        return dados.toString();
    }

    @Override
    public String toString() {
        return super.toString() + " Internacional{" +
                "pais='" + pais + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }
}
