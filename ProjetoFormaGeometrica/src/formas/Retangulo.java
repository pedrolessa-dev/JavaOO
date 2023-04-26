package formas;

import core.Forma2D;
import core.FormaGeometrica;

public class Retangulo extends FormaGeometrica implements Forma2D {
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return (base * 2) + (altura * 2);
	}

	@Override
	public String exibirInfo() {
		return "Retângulo:\nBase = " + this.base + " Altura = " + this.altura + "\nÁrea = " + calcularArea()
				+ " Perímetro = " + calcularPerimetro();
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
