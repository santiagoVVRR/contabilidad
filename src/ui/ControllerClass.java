package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ControllerClass {

    @FXML
    private TextField nombre;

    @FXML
    private TextField valor;

    @FXML
    private ComboBox<String> tipo;

    @FXML
    void generar(ActionEvent event) {

    }

    public void configureComboBox() {
    	tipo.getItems().add("Activo");
    	tipo.getItems().add("Pasivo");
    	tipo.getItems().add("Patrimonio");
    	tipo.getItems().add("Ingreso");
    	tipo.getItems().add("Gasto");
    }
    
    @FXML
    void initialize() {
    	configureComboBox();
    }
    
}
