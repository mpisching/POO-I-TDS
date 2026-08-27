module br.edu.ifsc.fln.prj_produto_jafafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens br.edu.ifsc.fln.prj_produto_jafafx to javafx.fxml;
    opens br.edu.ifsc.fln.controller to javafx.fxml;
    exports br.edu.ifsc.fln.prj_produto_jafafx;
}