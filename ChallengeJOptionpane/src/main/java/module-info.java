module com.br.gabriellybaiao.challengejoptionpane {
    requires javafx.controls;
    requires javafx.fxml;


    opens poo.aula3.atividade.exercicio3 to javafx.fxml;
    exports poo.aula3.atividade.exercicio3;
}