package formas;

import core.Forma3D;
import core.FormaGeometrica;

public class Paralelepipedo extends FormaGeometrica implements Forma3D {
	private double largura;
	private double altura;
	private double profundidade;

	public Paralelepipedo(double largura, double altura, double profundidade) {
		super();
		this.largura = largura;
		this.altura = altura;
		this.profundidade = profundidade;
	}

	@Override
	public double calcularVolume() {
		return this.largura * this.altura * this.profundidade;
	}

	@Override
	public String exibirInfo() {
		return "Paralelepípedo:\nLargura = " + this.largura + " Altura = " + this.altura + " Profundidade = "
				+ this.profundidade + "\nVolume = " + calcularVolume();
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

}
