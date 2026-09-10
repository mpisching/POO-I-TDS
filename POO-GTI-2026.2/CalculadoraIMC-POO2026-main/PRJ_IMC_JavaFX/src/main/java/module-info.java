module br.edu.ifsc.fln.prj_imc_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.ifsc.fln.prj_imc_javafx to javafx.fxml;
    opens br.edu.ifsc.fln.controller to javafx.fxml;
    exports br.edu.ifsc.fln.prj_imc_javafx;
}