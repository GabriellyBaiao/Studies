module com.example.desafio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafio to javafx.fxml;
    exports com.example.desafio;
}