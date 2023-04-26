import java.util.InputMismatchException;
import java.util.Scanner;

public class PorcentagemSalario {

	public static void main(String[] args) {
		while (true) {
			try {
				executarPrograma();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Erro: Digite um número. O programa será reiniciado");
			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage() + " O programa será reiniciado");
			}
		}
	}

	@SuppressWarnings("resource")
	private static void executarPrograma() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salário líquido");
		double salario = sc.nextDouble();
		System.out.println("Qual a porcentagem para o pagamento de contas?");
		int porcentoConta = sc.nextInt();
		System.out.println("Qual a porcentagem para os investimentos?");
		int porcentoInveste = sc.nextInt();
		System.out.println("Qual a porcentagem para o lazer e conhecimento?");
		int porcentoLazer = sc.nextInt();
		int total = porcentoConta + porcentoInveste + 10 + porcentoLazer;
		if (total != 100) {
			throw new IllegalArgumentException(String.format("O total (%d%%) precisa ser igual a 100%%, tente novamente", total));
		}
		System.out.printf(
				"%nSalário líquido = R$ %.2f%nPagamento de contas (%d%%) = R$ %.2f%nAplicações financeiras (%d%%) = R$ %.2f%nDízimo (10%%) = R$ %.2f%nConhecimento/Lazer (%d%%) = R$ %.2f%n",
				salario, porcentoConta, salario * porcentoConta / 100, porcentoInveste, salario * porcentoInveste / 100,
				salario * 0.1, porcentoLazer, salario * porcentoLazer / 100);
		sc.close();
	}
}
