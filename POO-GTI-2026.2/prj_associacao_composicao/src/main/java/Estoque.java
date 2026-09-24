public class Estoque {
    private int quantidade; //quantidade atual de produto no estoque
    private int qtdMaxima;
    private int qtdMinima;

    public Estoque() {
    }

    public Estoque(int qtdMaxima, int qtdMinima) {
        this.qtdMaxima = qtdMaxima;
        this.qtdMinima = qtdMinima;
    }

    public int getQuantidade() {
        return quantidade;
    }

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

    public void repor(int quantidade) {
        if (quantidade + this.quantidade <= qtdMaxima) {
            this.quantidade += quantidade;// x = x + i;
        } else {
            throw new IllegalArgumentException(
                    "A quantidade de reposição é maior que a capacidade do estoque");
        }
    }

    public void retirar(int qtd) {
        if (quantidade - qtd >= 0) {
            quantidade -= qtd;
        } else {
            throw new IllegalArgumentException(
                    "Não há estoque suficiente para esta operação.");
        }
    }

    public boolean isSuficiente() {
        if (quantidade < qtdMinima) {
            return true;
        } else {
            return false;
        }
    }
}
