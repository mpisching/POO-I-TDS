public enum EPrioridade {
    ALTA("Alta", 100), MEDIA("Média", 200), BAIXA("Baixa", 300);

    private String descricao;
    private int codigo;

    private EPrioridade(String descricao, int codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCodigo() {
        return codigo;
    }
}