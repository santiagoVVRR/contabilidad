package model;

import java.util.ArrayList;
import java.util.List;

public class Transacciones {

	private List<Cuenta> activo;
	private List<Cuenta> pasivo;
	private List<Cuenta> patrimonio;
	private List<Cuenta> ingreso;
	private List<Cuenta> gasto;

	public Transacciones() {
		activo = new ArrayList<>();
		pasivo = new ArrayList<>();
		patrimonio = new ArrayList<>();
		ingreso = new ArrayList<>();
		gasto = new ArrayList<>();
	}

	public List<Cuenta> getActivo() {
		return activo;
	}

	public void setActivo(List<Cuenta> activo) {
		this.activo = activo;
	}

	public List<Cuenta> getPasivo() {
		return pasivo;
	}

	public void setPasivo(List<Cuenta> pasivo) {
		this.pasivo = pasivo;
	}

	public List<Cuenta> getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(List<Cuenta> patrimonio) {
		this.patrimonio = patrimonio;
	}

	public List<Cuenta> getIngreso() {
		return ingreso;
	}

	public void setIngreso(List<Cuenta> ingreso) {
		this.ingreso = ingreso;
	}

	public List<Cuenta> getGasto() {
		return gasto;
	}

	public void setGasto(List<Cuenta> gasto) {
		this.gasto = gasto;
	}

	public void addTransaction(double value, String type, String name) {
		Cuenta temp = new Cuenta(name, value);

		if (type.equalsIgnoreCase("activo")) {
			if (activo.isEmpty()) {
				activo.add(temp);
			} else {
				boolean is = false;
				for (int i = 0; i < activo.size() && !is; i++) {
					if (name.equalsIgnoreCase(activo.get(i).getNombre())) {
						is = true;
						double v = activo.get(i).getValor() + value;
						activo.get(i).setValor(v);
					}
				}

				if (!is) {
					activo.add(temp);
				}
			}
		} else if (type.equalsIgnoreCase("pasivo")) {

		} else if (type.equalsIgnoreCase("patrimonio")) {

		} else if (type.equalsIgnoreCase("ingreso")) {

		} else if (type.equalsIgnoreCase("gasto")) {

		}
	}
}