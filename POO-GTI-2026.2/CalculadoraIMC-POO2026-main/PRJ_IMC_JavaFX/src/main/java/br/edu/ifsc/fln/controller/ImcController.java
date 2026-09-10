package br.edu.ifsc.fln.controller;

import br.edu.ifsc.fln.model.Imc;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ImcController {

    @FXML
    private TextField tfNome;

    @FXML
    private TextField tfIdade;

    @FXML
    private TextField tfPeso;

    @FXML
    private TextField tfAltura;

    @FXML
    public void onActionBTLimpar() {
        tfNome.clear();
        tfIdade.clear();
        tfPeso.clear();
        tfAltura.clear();
        tfNome.requestFocus();
    }

    @FXML
    public void onActionBTOk() {
        String nome = tfNome.getText();
        int idade = 0;
        double peso = 0.0;
        double altura = 0.0;

        try {
            idade = Integer.parseInt(tfIdade.getText());
            peso = Double.parseDouble(tfPeso.getText());
            altura = Double.parseDouble(tfAltura.getText());
        } catch (NumberFormatException error) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro!");
            alert.setHeaderText("Valor inválido!");
            alert.setContentText("Insira valores válidos.");
            alert.showAndWait();
            return;
        }

        Imc calcularImc = new Imc(nome, idade, peso, altura);

        //double imc = calcularImc.calcularImc();
        //String classificacao = calcularImc.classificarImc();

        exibirResultado(calcularImc);

    }

    private void exibirResultado(Imc imc) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Resultado");
        alert.setHeaderText("Seu IMC é:");
        alert.setContentText(
                String.format("%.2f", imc.calcularImc())
                        + ".\nSua classificação  é " + imc.classificarImc()
                        + ".\n" + "Com " + imc.getIdade() + " anos, " + imc.getNome() +
                        " está se preocupando com sua saúde. Parabéns!");
        alert.showAndWait();

    }
}
