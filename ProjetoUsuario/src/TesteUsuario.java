import java.util.Scanner;

public class TesteUsuario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Permissao p = new Permissao(123, "Pedro");
		String digitarLogin, digitarSenha;
		System.out.println(p.exibir());
		System.out.print("Login: ");
		digitarLogin = sc.nextLine();
		System.out.print("Senha: ");
		digitarSenha = sc.nextLine();
		Usuario u1 = new Usuario("Pedro Lessa", "senhadoituber", p);
		if ((digitarLogin.equals(u1.getLogin())) && digitarSenha.equals(u1.getSenha())) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Usuário e/ou senha inválidos");
		}
		sc.close();
	}
}
