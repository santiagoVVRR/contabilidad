package model;

public class Cuenta {

	private String nombre;
	private double valor;

	public Cuenta(String nombre, double valor) {

		this.setNombre(nombre);
		this.setValor(valor);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}