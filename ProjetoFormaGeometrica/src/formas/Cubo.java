package formas;

import core.*;

public class Cubo extends FormaGeometrica implements Forma2D, Forma3D {
	private double lado;

	public Cubo(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		return this.lado * this.lado * this.lado;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}

	@Override
	public double calcularPerimetro() {
		return this.lado * 4;
	}

	@Override
	public String exibirInfo() {
		return "Cubo:\nLado = " + this.lado + "\nÁrea = " + calcularArea() + " Perímetro = " + calcularPerimetro()
				+ " Volume = " + calcularVolume();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

}
