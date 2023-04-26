package userinterface;

import java.util.Scanner;

import core.Maquina;

public class Loja {
	public static void main(String[] args) {
		Maquina maquina = new Maquina();
		Scanner sc = new Scanner(System.in);
		int opcao;
		double valor;
		do {
			System.out.println(maquina.exibirDisplay());
			System.out.println("100 - Inserir crédito");
			System.out.println("101 - Solicitar troco");
			System.out.println(" -1 - Encerrar");
			opcao = sc.nextInt();
			switch (opcao) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				int res = maquina.comprarRefri(opcao);
				if (res == 0) {
					System.out.println("Aproveite seu refrigerante");
				} else if (res == -1) {
					System.out.println("ERRO - Saldo insuficiente");
				} else {
					System.out.println("ERRO - Estoque insuficiente");
				}
				break;
			case 100:
				System.out.println("Digite o valor a ser inserido");
				valor = sc.nextDouble();
				maquina.addCredito(valor);
				break;
			case 101:
				System.out.printf("Seu troco é: R$ %.2f%n", maquina.solicitarTroco());
				break;
			case -1:
				System.out.println("Obrigado");
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != -1);
		sc.close();
	}
}
