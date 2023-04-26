import java.util.Scanner;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, cargo;
		double salario;
		int aumento;
		System.out.println("Digite o nome do funcionário:");
		nome = sc.nextLine();
		System.out.println("Digite o cargo do funcionário:");
		cargo = sc.nextLine();
		System.out.println("Digite o salário do funcionário:");
		salario = sc.nextDouble();
		Funcionario funcionario = new Funcionario(nome, cargo, salario);
		System.out.println(funcionario.imprimir());
		System.out.println("\nInforme o percentual de aumento:");
		aumento = sc.nextInt();
		System.out.printf("Houve um acréscimo de: R$ %.2f%n", funcionario.aumentarSalario(aumento));
		System.out.printf("Salário após o aumento: R$ %.2f",
				funcionario.getSalario() + funcionario.aumentarSalario(aumento));
		sc.close();
	}
}