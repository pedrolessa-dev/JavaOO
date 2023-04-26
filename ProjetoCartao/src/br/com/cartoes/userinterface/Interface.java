package br.com.cartoes.userinterface;

import java.util.Scanner;
import br.com.cartoes.core.CartaoCashBack;
import br.com.cartoes.core.CartaoPrePago;

public class Interface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		double valor;
		String opcaoNome;

		System.out.println("Qual seu nome?");
		opcaoNome = sc.nextLine();
		switch (opcaoNome) {
		case "isidro":
		case "Isidro":
			CartaoPrePago cardPP1 = new CartaoPrePago("1111 1111 1111 1111", "Isidro", 2028, 06, 0.0);
			do {
				System.out.println(cardPP1.getNomeTitular()
						+ ", Escolha uma das opções abaixo:\n1 - Consultar saldo\n2 - Adicionar valor\n3 - Realizar pagamento\n0 - Sair");
				opcao = sc.nextInt();
				switch (opcao) {
				case 1:
					System.out.printf("Seu saldo é: R$ %.2f%n", cardPP1.getSaldo());
					break;
				case 2:
					System.out.println("Digite o valor a ser adicionado:");
					valor = sc.nextDouble();
					cardPP1.adicionarCredito(valor);
					break;
				case 3:
					System.out.println("Digite o valor a ser pago:");
					valor = sc.nextDouble();
					cardPP1.comprar(valor);
					break;
				case 0:
					System.out.println("Obrigado pela preferência!");
					System.exit(0);
				default:
					System.out.println("Opção inválida");
					break;
				}
			} while (opcao != 0);
			break;
		case "carlinhos":
		case "Carlinhos":
			CartaoCashBack cardCB1 = new CartaoCashBack("2222 2222 2222 2222", "Carlinhos", 2030, 05, 100.0, 1);
			do {
				System.out.println(cardCB1.getNomeTitular()
						+ ", Escolha uma das opções abaixo:\n1 - Consultar saldo\n2 - Adicionar valor\n3 - Realizar pagamento\n0 - Sair");
				opcao = sc.nextInt();
				switch (opcao) {
				case 1:
					System.out.printf("Seu saldo é: R$ %.2f%n", cardCB1.getSaldo());
					break;
				case 2:
					System.out.println("Digite o valor a ser adicionado:");
					valor = sc.nextDouble();
					cardCB1.adicionarCredito(valor);
					break;
				case 3:
					System.out.println("Digite o valor a ser pago:");
					valor = sc.nextDouble();
					cardCB1.comprar(valor);
					break;
				case 0:
					System.out.println("Obrigado pela preferência!");
					System.exit(0);
				default:
					System.out.println("Opção inválida");
					break;
				}
			} while (opcao != 0);
			break;
		case "wagner":
		case "Wagner":
			CartaoCashBack cardCB2 = new CartaoCashBack("3333 3333 3333 3333", "Wagner", 2031, 10, 150.0, 2);
			do {
				System.out.println(cardCB2.getNomeTitular()
						+ ", Escolha uma das opções abaixo:\n1 - Consultar saldo\n2 - Adicionar valor\n3 - Realizar pagamento\n0 - Sair");
				opcao = sc.nextInt();
				switch (opcao) {
				case 1:
					System.out.printf("Seu saldo é: R$ %.2f%n", cardCB2.getSaldo());
					break;
				case 2:
					System.out.println("Digite o valor a ser adicionado:");
					valor = sc.nextDouble();
					cardCB2.adicionarCredito(valor);
					break;
				case 3:
					System.out.println("Digite o valor a ser pago:");
					valor = sc.nextDouble();
					cardCB2.comprar(valor);
					break;
				case 0:
					System.out.println("Obrigado pela preferência!");
					System.exit(0);
				default:
					System.out.println("Opção inválida");
					break;
				}
			} while (opcao != 0);
			break;
		case "pedro":
		case "Pedro":
			CartaoCashBack cardCB3 = new CartaoCashBack("4444 4444 4444 4444", "Pedro", 2034, 04, 250.0, 3);
			do {
				System.out.println(cardCB3.getNomeTitular()
						+ ", Escolha uma das opções abaixo:\n1 - Consultar saldo\n2 - Adicionar valor\n3 - Realizar pagamento\n0 - Sair");
				opcao = sc.nextInt();
				switch (opcao) {
				case 1:
					System.out.printf("Seu saldo é: R$ %.2f%n", cardCB3.getSaldo());
					break;
				case 2:
					System.out.println("Digite o valor a ser adicionado:");
					valor = sc.nextDouble();
					cardCB3.adicionarCredito(valor);
					break;
				case 3:
					System.out.println("Digite o valor a ser pago:");
					valor = sc.nextDouble();
					cardCB3.comprar(valor);
					break;
				case 0:
					System.out.println("Obrigado pela preferência!");
					System.exit(0);
				default:
					System.out.println("Opção inválida");
					break;
				}
			} while (opcao != 0);
		default:
			System.out.println("Este nome não foi cadastrado");
		}
		sc.close();
	}
}
