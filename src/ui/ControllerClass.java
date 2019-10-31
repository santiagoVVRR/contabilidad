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
import javafx.scene.layout.GridPane;
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

<<<<<<< HEAD
	@FXML
	private Label pat;

	@FXML
	private Label pat1;
=======
    

  
>>>>>>> 081dd4e8eceb604e14ecd009b210a83d07bb1dfb

	@FXML
	private Label activos;

<<<<<<< HEAD
	@FXML
	private Label pasivos;
=======
  
>>>>>>> 081dd4e8eceb604e14ecd009b210a83d07bb1dfb

	@FXML
	private Label patrimonio;

	@FXML
	private Label pasivospatrimonio;

	@FXML
	private Label ing;

	@FXML
	private Label gas;

	@FXML
	private Label gas1;

<<<<<<< HEAD
	@FXML
	private Label ingresos;

	@FXML
	private Label gastos;
=======
   
>>>>>>> 081dd4e8eceb604e14ecd009b210a83d07bb1dfb

	@FXML
	private Label utilidad;

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
	private Label est;

    @FXML
    private GridPane gb;
    
    @FXML
    private GridPane ge;
    
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
		
		act.setVisible(true);
		pas.setVisible(true);
		est.setVisible(true);
		bal.setVisible(true);
		pat.setVisible(true);
		//labelAct.setVisible(true);
		//labelPas.setVisible(true);
		//labelPat.setVisible(true);
		//labelIng.setVisible(true);
		//labelGas.setVisible(true);

		periodo.setVisible(true);
		periodo1.setVisible(true);
		nombreEmpresa1.setVisible(true);
		nombreEmpresa.setVisible(true);
		
		gb = new GridPane();
		ge = new GridPane();
		
		
		double v = Integer.parseInt(valor.getText());
		Label ac = new Label();
		ac.setText(nombre.getText() + v );
		gb.add(ac, 0, 0);
	}

	@FXML
	void terminar(ActionEvent event) {
		act.setVisible(true);
		pas.setVisible(true);

		est.setText(name.getText() + "\n" + "ESTADO DE RESULTADOS\n" + period.getText());
		bal.setText(name.getText() + "\n" + "BALANCE GENERAL\n" + period.getText());

		est.setVisible(true);
		bal.setVisible(true);
		
		summer();
		
		pat.setVisible(true);
<<<<<<< HEAD
		gas1.setVisible(true);
		pat1.setVisible(true);
		tipo.setDisable(true);
		valor.setDisable(true);
		nombre.setDisable(true);
		gas.setVisible(true);
		ing.setVisible(true);
		
		tres.setVisible(false);
		cuatro.setVisible(false);
		cinco.setVisible(false);
		add.setDisable(true);

=======
		//labelAct.setVisible(true);
		//labelPas.setVisible(true);
		//labelPat.setVisible(true);
		//labelIng.setVisible(true);
		//labelGas.setVisible(true);

		periodo.setVisible(true);
		periodo1.setVisible(true);
		nombreEmpresa1.setVisible(true);
		nombreEmpresa.setVisible(true);
		
		gb = new GridPane();
		ge = new GridPane();
		
		
		Label labelAct = new Label(nombre.getText());
		gb.add(labelAct, 0, 0);
			
>>>>>>> 081dd4e8eceb604e14ecd009b210a83d07bb1dfb
		
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
		gas.setVisible(false);
		pat.setVisible(false);
		ing.setVisible(false);
		gas1.setVisible(false);
		pat1.setVisible(false);

		name.setVisible(true);
		period.setVisible(true);
		addInf.setVisible(true);
		uno.setVisible(true);
		dos.setVisible(true);
		tres.setVisible(false);
		cuatro.setVisible(false);
		cinco.setVisible(false);

		transacciones = new Transacciones();
	}

	private void summer() {
		double activs = transacciones.summer("activo");
		double pasivs = transacciones.summer("pasivo");
		double patrimono = transacciones.summer("patrimonio");
		double ingreso = transacciones.summer("ingreso");
		double gasto = transacciones.summer("gasto");

		activos.setText(activs + "");
		pasivos.setText(pasivs + "");
		patrimonio.setText(patrimono + "");
		ingresos.setText(ingreso + "");
		gastos.setText(gasto + "");

		pasivospatrimonio.setText((pasivs + patrimono) + "");
		utilidad.setText((ingreso - gasto) + "");
	}
}