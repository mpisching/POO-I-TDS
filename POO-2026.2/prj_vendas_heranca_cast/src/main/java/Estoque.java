public class Estoque {

    private int quantidade; //armazena a quantidade atual de um determinado produto no estoque
    private int qtdMaxima;
    private int qtdMinima;

    private ESituacao situacao = ESituacao.ATIVO;

    public Estoque(int qtdMaxima, int qtdMinima) {
        this.qtdMaxima = qtdMaxima;
        this.qtdMinima = qtdMinima;
    }

    public Estoque() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    //é desejável a sua implementação?
    //ele não implementa as regras de negócio de reposição e retirada
//    public void setQuantidade(int quantidade) {
//        this.quantidade = quantidade;
//    }

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

    public ESituacao getSituacao() {
        return situacao;
    }

    public void setSituacao(ESituacao situacao) {
        this.situacao = situacao;
    }

    public void repor(int quantidade) {
        if (situacao == ESituacao.ATIVO) {
            if (quantidade + this.quantidade <= qtdMaxima) {
                this.quantidade += quantidade; // quantidade = quantidade + qtd
            } else {
                throw new IllegalArgumentException(
                        "Não há espaço suficiente para armazenar a quantidade de reposição.");
            }
        } else {
            throw new RuntimeException("A situação atual do estoque não permite " +
                "qualquer tipo de movimentação - " + situacao);
        }
    }

    public void retirar(int qtd) {
        if (situacao == ESituacao.ATIVO) {
            if (quantidade - qtd >= 0) {
                this.quantidade -= qtd;
            } else {
                throw new IllegalArgumentException(
                    "Não há quantidade suficiente de produtos no " +
                            "estoque para atender esta retirada.");
            }
        } else {
            throw new RuntimeException("A situação atual do estoque não permite " +
                    "qualquer tipo de movimentação - " + situacao);
        }
    }
}
