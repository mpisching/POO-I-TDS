public enum ESituacao {
    ATIVO("Ativo"),  INATIVO("Inativo"), BLOQUEADO ("Bloqueado");
    private String descricao;

    private ESituacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
