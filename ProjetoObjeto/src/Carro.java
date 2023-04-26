// definição da classe
public class Carro {

	// definição dos atributos
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private double preco;

	// definição dos GETs e SETs
	// --> Source --> Generate Getters and Setters --> Select all --> Generate
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// definição dos métodos
	public void exibirAnuncio() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.printf("Ano: %d / Preço: R$ %.2f%n", ano, preco);
	}

	public double calcularSeguro(int perfil) {
		double valor;
		if (perfil == 0) {
			valor = preco * 0.10;
		} else if (perfil == 1) {
			valor = preco * 0.05;
		} else {
			valor = preco * 0.03;
		}
		return valor;
	}
}