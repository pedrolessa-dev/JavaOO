package br.com.bancoteste.core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numRegistro;
	protected double saldo;

	public Conta(String nomeTitular, String cpf, int numRegistro, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numRegistro = numRegistro;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Nome do titular: " + nomeTitular + " (" + cpf + ") - " + numRegistro
				+ String.format("%nSaldo: R$ %.2f%n", saldo);
	}

	public boolean debitar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Débito realizado");
			return true;
		} else {
			System.out.printf("Você não pode sacar um valor maior que seu saldo (R$ %.2f)%n", saldo);
			return false;
		}
	}

	public void creditar(double valor) {
		saldo += valor;
		System.out.println("Crédito realizado");
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}