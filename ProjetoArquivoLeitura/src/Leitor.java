import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
	public static void main(String[] args) {
		try {
			// vou precisar manipular o arquivo (por isso o objeto File)
			File f = new File("dados.txt");
			// esse arquivo tem que ser manipulado para leitura
			// (por isso o FileReader)
			FileReader fr = new FileReader(f);
			// O BufferedReader vai ler o arquivo linha a linha
			BufferedReader br = new BufferedReader(fr);
			String linha;
			do {
				// ler todo o arquivo como String
				linha = br.readLine();
				if (linha != null) {
					// Separa os dados com ;
					String infos[] = linha.split(";");
					// converter o id (primeiro iten, na posição 0)
					// de String para int
					int id = Integer.parseInt(infos[0]);
					// declarar o nome (segundo iten, na posição 1)
					// o nome já está em String
					String nome = infos[1];
					// converter o preço (terceiro iten, na posição 2)
					// de String para double
					double preco = Double.parseDouble(infos[2]);
					Produto p = new Produto(id, nome, preco);
					System.out.println(p);
				}
			} while (linha != null);
			fr.close();
			br.close();
		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
