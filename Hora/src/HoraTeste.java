import java.util.Scanner;

public class HoraTeste {
	public static void main(String[] args) {
		int hora, minuto, segundo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora:");
		hora = sc.nextInt();
		System.out.println("Digite o minuto:");
		minuto = sc.nextInt();
		System.out.println("Digite o segundo:");
		segundo = sc.nextInt();
		Hora time = new Hora();
		time.setTime(hora, minuto, segundo);
		System.out.println(time.exibirHoraUniversal());
		System.out.println(time.exibirHoraPadrao());
		sc.close();
	}
}
