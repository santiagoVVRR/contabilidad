package model;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private String nombre;
	private double valor;
	private List<String> activo;
	private List<String> pasivo;
	private List<String> patrimonio;
	private List<String> ingreso;
	private List<String> gasto;
	
	public Cuenta(String nombre, double valor) {
		
		this.nombre = nombre;
		this.valor = valor;
		activo = new ArrayList<String>();
		pasivo = new ArrayList<String>();
		patrimonio = new ArrayList<String>();
		ingreso =  new ArrayList<String>();
		gasto = new ArrayList<String>();
	}
	
	
	
	
}
