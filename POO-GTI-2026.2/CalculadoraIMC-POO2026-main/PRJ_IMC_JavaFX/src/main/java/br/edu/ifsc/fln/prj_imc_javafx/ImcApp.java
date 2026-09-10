package br.edu.ifsc.fln.prj_imc_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ImcApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ImcApp.class.getResource("ImcView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 601, 262);
        stage.setTitle("Calculadora de IMC");
        stage.setScene(scene);
        stage.show();
    }
}
