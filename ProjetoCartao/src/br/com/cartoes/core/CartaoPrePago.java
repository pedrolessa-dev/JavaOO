package br.com.cartoes.core;

public class CartaoPrePago {
	protected String numCartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;

	public CartaoPrePago(String numCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numCartao = numCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}

	public void adicionarCredito(double valor) {
		this.saldo += valor;
		System.out.println("Valor adicionado com sucesso");
	}

	public boolean comprar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Pagamento realizado com sucesso");
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
