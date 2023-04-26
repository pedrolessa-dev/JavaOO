import java.util.Scanner;

public class Loja {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strId;
		int id;
		String nome;
		String strPreco;
		double preco;
		Produto p = new Produto();
//		int loop = 1;
		boolean end = false;
		do {
			try {
				System.out.println("Digite o código do produto");
				strId = sc.nextLine();
				id = Integer.parseInt(strId);
				p.setId(id);
				System.out.println("Digite o nome do produto");
				nome = sc.nextLine();
				p.setNome(nome);
				System.out.println("Digite o preço do produto");
				strPreco = sc.nextLine();
				preco = Double.parseDouble(strPreco);
				p.setPreco(preco);
				System.out.println(p);
				sc.close();
//				loop = 0;
				end = true;
			} catch (MyException e) {
				System.out.println("Erro ao preencher: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("ERRO");
			}
		} while (!end);
	}
}
