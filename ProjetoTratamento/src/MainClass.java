import java.util.InputMismatchException;
//import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		try {
//			Scanner sc = new Scanner(System.in);
//			int v1, v2, r;
//			System.out.println("Digite um valor:");
//			v1 = sc.nextInt();
//			System.out.println("Digite outro valor:");
//			v2 = sc.nextInt();
//			r = v1 / v2;
//			System.out.println("A divisão dos valores é " + r);
//			sc.close();
			Produto p = new Produto();
			p.setId(-1);
		} catch (PedroException e) {
			System.out.println("Erro de preenchimento - " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Digite um número inteiro");
		} catch (ArithmeticException e) {
			System.out.println("Não é possível dividir um número por zero");
		} catch (RuntimeException e) {
			System.out.println("Erro ao preencher o produto");
			System.out.println("ERRO: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ops... deu erro");
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
