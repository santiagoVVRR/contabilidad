package ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.StageStyle;

public class ControllerClass {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField nombre;

	@FXML
	private TextField valor;

	@FXML
	private ComboBox<String> tipo;

	@FXML
	private Label act;

	@FXML
	private Label pas;

	@FXML
	private Label periodo1;

	@FXML
	private Label est;

	@FXML
	private Label nombreEmpresa;

	@FXML
	private Label periodo;

	@FXML
	private Button add;

	@FXML
	private Label bal;

	@FXML
	private Label nombreEmpresa1;

	@FXML
	private TextField name;

	@FXML
	private TextField period;

	@FXML
	private Button finish;

	@FXML
	private Button addInf;

	@FXML
	private Label dos;

	@FXML
	private Label uno;

	@FXML
	private Label tres;

	@FXML
	private Label cuatro;

	@FXML
	private Label cinco;

	@FXML
	void AgregarInfo(ActionEvent event) {
		if (period.getText() == null || name.getText() == null || period.getText().equalsIgnoreCase("")
				|| name.getText().equalsIgnoreCase("")) {
			Alert info = new Alert(AlertType.ERROR);
			info.setTitle("ERROR");
			info.setHeaderText(null);
			info.initStyle(StageStyle.UTILITY);
			info.setContentText("please select a valid name");
			info.show();
		} else {
			nombre.setVisible(true);
			valor.setVisible(true);
			tipo.setVisible(true);
			add.setVisible(true);
			tres.setVisible(true);
			cuatro.setVisible(true);
			cinco.setVisible(true);

			tipo.getItems().add("Activo");
			tipo.getItems().add("Pasivo");
			tipo.getItems().add("Patrimonio");
			tipo.getItems().add("Ingreso");
			tipo.getItems().add("Gasto");

			name.setVisible(false);
			period.setVisible(false);
			addInf.setVisible(false);
			uno.setVisible(false);
			dos.setVisible(false);

			setLabels();
		}
	}

	@FXML
	void agregar(ActionEvent event) {

	}

	@FXML
	void terminar(ActionEvent event) {
		act.setVisible(true);
		pas.setVisible(true);
		est.setVisible(true);
		bal.setVisible(true);

		periodo.setVisible(true);
		periodo1.setVisible(true);
		nombreEmpresa1.setVisible(true);
		nombreEmpresa.setVisible(true);
	}

	@FXML
	void initialize() {
		nombre.setVisible(false);
		valor.setVisible(false);
		tipo.setVisible(false);
		add.setVisible(false);
		finish.setVisible(false);
		act.setVisible(false);
		pas.setVisible(false);
		est.setVisible(false);
		bal.setVisible(false);
		periodo.setVisible(false);
		periodo1.setVisible(false);
		nombreEmpresa1.setVisible(false);
		nombreEmpresa.setVisible(false);

		name.setVisible(true);
		period.setVisible(true);
		addInf.setVisible(true);
		uno.setVisible(true);
		dos.setVisible(true);
		tres.setVisible(false);
		cuatro.setVisible(false);
		cinco.setVisible(false);
	}

	private void setLabels() {
		periodo.setText(period.getText());
		periodo1.setText(period.getText());
		nombreEmpresa1.setText(name.getText());
		nombreEmpresa.setText(name.getText());
	}
}