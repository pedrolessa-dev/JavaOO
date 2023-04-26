package br.com.bancoteste.userinterface;

import java.util.Scanner;
import br.com.bancoteste.core.Conta;
import br.com.bancoteste.core.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual seu tipo de conta:\n1 - Conta comum\n2 - Conta especial");
		int opcaoMenu = 0, opcaoTipoConta = sc.nextInt();
		double saldo;
		switch (opcaoTipoConta) {
		case 1:
			Conta c1 = new Conta("João", "123.456.789-00", 159753, 0);
			System.out.println(c1);
			System.out.println("Bem-vindo " + c1.getNomeTitular() + "!");
			do {
				System.out.println(
						"\nO que deeseja fazer?\n1 - Consultar saldo\n2 - Creditar valor\n3 - Debitar valor\n0 - Sair");
				opcaoMenu = sc.nextInt();
				switch (opcaoMenu) {
				case 1:
					System.out.printf("Saldo = R$ %.2f%n", c1.getSaldo());
					break;
				case 2:
					System.out.println("Quanto deseja creditar?");
					saldo = sc.nextDouble();
					c1.creditar(saldo);
					break;
				case 3:
					System.out.println("Quanto deseja debitar?");
					saldo = sc.nextDouble();
					c1.debitar(saldo);
					break;
				case 0:
					System.out.println("Obrigado pela preferência!");
					System.exit(0);
				default:
					System.out.println("Opção inválida");
					break;
				}
			} while (opcaoMenu != 0);
		case 2:
			ContaEspecial ce1 = new ContaEspecial("Pedro", "185.446.780-00", 357064, 0, 500);
			System.out.println(ce1);
			System.out.println("Bem-vindo " + ce1.getNomeTitular() + "!");
			do {
				System.out.println(
						"\nO que deeseja fazer?\n1 - Consultar saldo\n2 - Creditar valor\n3 - Debitar valor\n0 - Sair");
				opcaoMenu = sc.nextInt();
				switch (opcaoMenu) {
				case 1:
					System.out.printf("Saldo = R$ %.2f%n", ce1.getSaldo());
					break;
				case 2:
					System.out.println("Quanto deseja creditar?");
					saldo = sc.nextDouble();
					ce1.creditar(saldo);
					break;
				case 3:
					System.out.println("Quanto deseja debitar?");
					saldo = sc.nextDouble();
					ce1.debitar(saldo);
					break;
				case 0:
					System.out.println("Obrigado pela preferência!");
					System.exit(0);
				default:
					System.out.println("Opção inválida");
					break;
				}

			} while (opcaoMenu != 0);
		default:
			System.out.println("Opção inválida");
		}
		sc.close();
	}
}