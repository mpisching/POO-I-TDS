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
}
