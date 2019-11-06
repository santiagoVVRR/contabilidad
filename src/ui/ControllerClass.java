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
import model.Transacciones;

public class ControllerClass {

	private Transacciones transacciones;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Label tres;

	@FXML
	private Label cuatro;

	@FXML
	private Label cinco;

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
	private Label pat;

	@FXML
	private Label cuentas;

	@FXML
	private Label actGas;

	@FXML
	private Label paPatIng;

	@FXML
	private Button add;

	@FXML
	private TextField name;

	@FXML
	private Label dos;

	@FXML
	private Label uno;

	@FXML
	private TextField period;

	@FXML
	private Label bal;

	@FXML
	private Button finish;

	@FXML
	private Button addInf;

	@FXML
	private Label sumas;

	@FXML
	private Label activoGasto;

	@FXML
	private Label patrimonioPasivoIngreso;

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

		}
	}

	@FXML
	void agregar(ActionEvent event) {
		if (nombre.getText() == null || valor.getText() == null || nombre.getText().equalsIgnoreCase("")
				|| valor.getText().equalsIgnoreCase("") || tipo.getItems().isEmpty() || tipo == null) {
			Alert info = new Alert(AlertType.ERROR);
			info.setTitle("ERROR");
			info.setHeaderText(null);
			info.initStyle(StageStyle.UTILITY);
			info.setContentText("please select a valid values");
			info.show();
		} else {
			try {
				double value = Integer.parseInt(valor.getText());
				transacciones.addTransaction(value, tipo.getValue(), nombre.getText());

				Alert info = new Alert(AlertType.INFORMATION);
				info.setTitle("ADDED");
				info.setHeaderText(null);
				info.initStyle(StageStyle.UTILITY);
				info.setContentText("the transaction has been added");
				info.show();

			} catch (NumberFormatException e) {
				Alert info = new Alert(AlertType.ERROR);
				info.setTitle("ERROR");
				info.setHeaderText(null);
				info.initStyle(StageStyle.UTILITY);
				info.setContentText("The value must be a number");
				info.show();
			} catch (NullPointerException e) {
				Alert info = new Alert(AlertType.ERROR);
				info.setTitle("ERROR");
				info.setHeaderText(null);
				info.initStyle(StageStyle.UTILITY);
				info.setContentText("Select an account type");
				info.show();
			}
		}

		valor.setText("");
		nombre.setText("");
		finish.setVisible(true);

	}
	
	 @FXML
	    void ajustes(ActionEvent event) {

	    }

	    @FXML
	    void editar(ActionEvent event) {
	    	
	    	double v = Integer.parseInt(valor.getText());
	    	transacciones.edit(tipo.getValue(), nombre.getText(), v);
	    	
	    	valor.setText("");
			nombre.setText("");
			finish.setVisible(true);
			finish.setDisable(false);
			
			
			
	    }

	@FXML
	void terminar(ActionEvent event) {
		act.setVisible(true);
		pas.setVisible(true);
		bal.setVisible(true);
		pat.setVisible(true);
		sumas.setVisible(true);

		act.setVisible(true);
		pas.setVisible(true);

		bal.setText(name.getText() + "\n" + "BALANCE DE PRUEBA\n" + period.getText());

		bal.setVisible(true);

		summer();

		pat.setVisible(true);
		//tipo.setDisable(true);
		//valor.setDisable(true);
		//nombre.setDisable(true);

		tres.setVisible(false);
		cuatro.setVisible(false);
		cinco.setVisible(false);
		add.setDisable(true);
		finish.setDisable(true);

		print();
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
		bal.setVisible(false);
		pat.setVisible(false);
		sumas.setVisible(false);
		tres.setVisible(false);
		cuatro.setVisible(false);
		cinco.setVisible(false);

		name.setVisible(true);
		period.setVisible(true);
		addInf.setVisible(true);
		uno.setVisible(true);
		dos.setVisible(true);

		transacciones = new Transacciones();
	}

	private void summer() {
		double activs = transacciones.summer("activo");
		double pasivs = transacciones.summer("pasivo");
		double patrimono = transacciones.summer("patrimonio");
		double ingreso = transacciones.summer("ingreso");
		double gasto = transacciones.summer("gasto");

		activoGasto.setText((activs + gasto) + "");
		patrimonioPasivoIngreso.setText((pasivs + patrimono + ingreso) + "");
	}

	private void print() {
		String c = "";
		String v = "";
		String v2 = "";
		
		for (int i = 0; i < transacciones.getActivo().size(); i++) {
			v2 += " \n";
			c += transacciones.getActivo().get(i).getNombre() + "\n";
			v += transacciones.getActivo().get(i).getValor() + "\n";
		}
		for (int i = 0; i < transacciones.getGasto().size(); i++) {
			v2 += " \n";
			c += transacciones.getGasto().get(i).getNombre() + "\n";
			v += transacciones.getGasto().get(i).getValor() + "\n";
		}
		
		for (int i = 0; i < transacciones.getPasivo().size(); i++) {
			v += " \n";
			c += transacciones.getPasivo().get(i).getNombre() + "\n";
			v2 += transacciones.getPasivo().get(i).getValor() + "\n";
		}
		for (int i = 0; i < transacciones.getPatrimonio().size(); i++) {
			v += " \n";
			c += transacciones.getPatrimonio().get(i).getNombre() + "\n";
			v2 += transacciones.getPatrimonio().get(i).getValor() + "\n";
		}
		for (int i = 0; i < transacciones.getIngreso().size(); i++) {
			v += " \n";
			c += transacciones.getIngreso().get(i).getNombre() + "\n";
			v2 += transacciones.getIngreso().get(i).getValor() + "\n";
		}
		
		cuentas.setText(c);
		actGas.setText(v);
		paPatIng.setText(v2);
	}
}