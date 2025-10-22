public class Nacional extends Fornecedor {
    private String cnpj;

    public Nacional() {
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

    @Override
    public String getDados() {
        StringBuilder dados = new StringBuilder();
        dados.append(super.getDados());
        dados.append("\nPais: " + getCnpj());
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
        return super.toString() + " Nacional{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }
}
