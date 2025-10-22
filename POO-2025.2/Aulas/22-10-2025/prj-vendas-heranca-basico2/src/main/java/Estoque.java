public class Estoque {
    private int quantidade;
    private int qtdMaxima;
    private int qtdMinima;

    private ESituacao situacao = ESituacao.ATIVO;

    public Estoque() {
    }

    public Estoque(int quantidade, int qtdMinima, int qtdMaxima) {
        this.quantidade = quantidade;
        this.qtdMaxima = qtdMaxima;
        this.qtdMinima = qtdMinima;
    }

    public int getQuantidade() {
        return quantidade;
    }

//    public void setQuantidade(int quantidade) {
//        this.quantidade = quantidade;
//    }


    public ESituacao getSituacao() {
        return situacao;
    }

    public void setSituacao(ESituacao situacao) {
        this.situacao = situacao;
    }

    public int getQtdMaxima() {
        return qtdMaxima;
    }

    public void setQtdMaxima(int qtdMaxima) {
        this.qtdMaxima = qtdMaxima;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void repor(int quantidade) throws Exception {
        if (situacao != ESituacao.ATIVO) {
            throw new RuntimeException ("A situação do estoque não permite movimentação " + situacao);
        }
        if (((quantidade + this.quantidade) <= this.qtdMaxima)) {
            this.quantidade += quantidade;
        } else {
            throw new Exception("Capacidade de estoque não suportada.");
        }
    }

    public void retirar(int quantidade) throws RuntimeException {
        if ((quantidade - this.quantidade) >= 0) {
            this.quantidade -= quantidade;
        } else {
            throw new RuntimeException("Não há estoque suficiente");
        }
    }
}

