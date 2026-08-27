package br.edu.ifsc.fln.controller;

import br.edu.ifsc.fln.model.Produto;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class ProdutoController {

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfPreco;

    @FXML
    private TextField tfDesconto;


    @FXML
    public void onActionBtLimpar() {
        tfNome.setText("");
        tfPreco.clear();
        tfDesconto.setText("");
        tfNome.requestFocus();
    }

    @FXML
    public void onActionBtOk() {
        String nome =  tfNome.getText();
        double preco = 0.0;
        double desconto = 0.0;
        try {
            preco = Double.parseDouble(tfPreco.getText());
            desconto = Double.parseDouble(tfDesconto.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Valor inválido");
            alert.setContentText("Informe valores numéricos válidos");
            alert.showAndWait();
        }
        //int idade = Integer.parseInt(tfIdade.getText());

        Produto produto = new Produto(nome, preco, desconto);

        double precoFinal = produto.calcularPrecoFinal();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Resultado");

        alert.setHeaderText("Preço final: ");

        alert.setContentText(
                "Produto: " + produto.getNome()
                + "\nPreço: R$ " + produto.getPreco()
                + "\nDesconto: R$ " + produto.getDesconto()
                + "\nPreço Final: R$ " + precoFinal
        );

        alert.showAndWait();

    }


}
