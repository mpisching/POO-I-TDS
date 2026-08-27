package br.edu.ifsc.fln.prj_produto_jafafx;

import br.edu.ifsc.fln.model.Produto;

public class MainTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Café", 20.0, 3.0);

        double precoFinal = produto.calcularPrecoFinal();

        System.out.println("Preco final: " + precoFinal);

    }
}
