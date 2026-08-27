package br.edu.ifsc.fln.prj_produto_jafafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ProdutoView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 467, 195);
        stage.setTitle("Calculadora de preço de produto...");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}