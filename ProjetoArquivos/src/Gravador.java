import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gravador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		try {
			// Preciso manipular um arquivo (uso o objeto File)
			File f = new File("dados.txt");
			// Vou manipular o meu arquivo em modo escrita (o true)
			// serve para adicionar novos dados, sem ele, os dados
			// seriam substituídos. Nome técnico disso: append
			FileWriter fr = new FileWriter(f, true);
			// Agora vou usar o println para imprimir neste arquivo
			PrintWriter pr = new PrintWriter(fr);
			Produto p;
			for (int i = 1; i <= 10; i++) {
				p = new Produto(i, "Produto" + i, i * 100);
				System.out.println("Deseja gravar o produto de código " + i + "? (1 para sim e 0 para não)");
				opcao = sc.nextInt();
				if (opcao == 1) {
					pr.println(p);
				}
			}
			pr.close();
			fr.close();
			System.out.println("Gravei tudo no arquivo");
		} catch (IOException ex) {
			System.out.println("Erro: " + ex.getMessage());
		}
		sc.close();
	}
}
