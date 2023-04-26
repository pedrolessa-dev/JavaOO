package main;

import core.FormaGeometrica;
import formas.*;

public class Interface {
	public static void main(String[] args) {
		FormaGeometrica retangulo = new Retangulo(7, 15.5), parelelepipedo = new Paralelepipedo(24, 16, 18),
				cubo = new Cubo(4);
		System.out.println(retangulo.exibirInfo() + "\n-------------------------------------------------------");
		System.out.println(parelelepipedo.exibirInfo() + "\n-------------------------------------------------------");
		System.out.println(cubo.exibirInfo() + "\n-------------------------------------------------------");
	}
}
