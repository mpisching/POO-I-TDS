public class Nacional extends Fornecedor {
    private String cnpj;

    public Nacional() {
        super();
    }

    public Nacional(int id, String nome, String email, String fone, String cnpj) {
        super(id, nome, email, fone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDados());
        sb.append("CNPJ........: " + cnpj + "\n");
        return sb.toString();
    }

    public String getDados(String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append(getDados());
        sb.append("Mensagem: " ).append(msg).append("\n");
        return sb.toString();
    }
}
