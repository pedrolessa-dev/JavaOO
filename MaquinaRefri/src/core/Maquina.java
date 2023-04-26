package core;

public class Maquina {
	private Refrigerante lista[];
	private double credito;

	public Maquina() {
		this.lista = new Refrigerante[5];
		this.lista[0] = new Refrigerante("Coca Cola", 2.5, 10);
		this.lista[1] = new Refrigerante("Fanta", 1.65, 7);
		this.lista[2] = new Refrigerante("Pepsi", 2.4, 8);
		this.lista[3] = new Refrigerante("Guaraná", 2.7, 11);
		this.lista[4] = new Refrigerante("Sprite", 1.8, 5);
		this.credito = 0;
	}

	public void addCredito(double valor) {
		this.credito += valor;
	}

	// na compra temos 3 possibilidades
	//  0 = Compra bem sucedida
	// -1 = Saldo insuficiente
	// -2 = Estoque zerado
	public int comprarRefri(int numRefri) {
		if (this.credito > lista[numRefri].getPreco()) {        // tem crédito?
			if (lista[numRefri].getQtd() > 0) {                 // tem estoque?
				this.credito -= lista[numRefri].getPreco();     // atualizar o saldo do crédito
				int qtdRefri = lista[numRefri].getQtd() - 1;
				lista[numRefri].setQtd(qtdRefri);               // atualiza o estoque do refri (-1)
				return 0;
			}
			return -2;
		}
		return -1;
	}

	public double solicitarTroco() {
		double troco = this.credito;
		this.credito = 0;
		return troco;
	}

	public String exibirDisplay() {
		String display = "Máquina de refri - Seu saldo: " + String.format("R$ %.2f%n", credito)
		+ "-------------------------------------\n";
		for (int i = 0; i <= 4; i++) {
			display += " " + i + " - " + lista[i].getNome() + String.format(" - R$ %.2f%n", lista[i].getPreco());
		}
		return display;
	}

}
