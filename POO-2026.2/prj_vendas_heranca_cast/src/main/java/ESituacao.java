public enum ESituacao {

    ATIVO(10, "Ativo"), INATIVO(20, "Inativo"), BLOQUEADO(30, "Bloqueado");

    private int codigo;
    private String descricao;

    private ESituacao(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
