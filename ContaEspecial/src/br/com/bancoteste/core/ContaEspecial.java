package br.com.bancoteste.core;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numRegistro, double saldo, double limite) {
		super(nomeTitular, cpf, numRegistro, saldo);
		this.limite = limite;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("Limite: R$ %.2f%n", limite);
	}

	public boolean debitar(double valor) {
		if (saldo + limite >= valor) {
			this.saldo -= valor;
			System.out.println("Débito realizado");
			return true;
		} else {
			System.out.printf("Você atingiu seu limite de R$ %.2f%n", limite);
			return false;
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}