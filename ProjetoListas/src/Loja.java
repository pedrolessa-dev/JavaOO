import java.util.ArrayList;

public class Loja {
	public static void main(String[] args) {
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();
		lista.add(new Produto(1, "Computador", 1500));
		lista.add(new Produto(2, "Mouse", 50));
		lista.add(new Produto(3, "Teclado", 80));
		lista.add(new Produto(4, "Impressora", 450));
		
		// remove um iten na lista
		lista.remove(1);
		for (Produto p : lista) {
			System.out.println(p);
		}
		
		System.out.println("-----------------------");
		
		// lista.get(num da posição) 
		System.out.println("Posição 2 = "+lista.get(2));
		
		System.out.println("------------------------");
		
		// adicionou o iten novamente a lista (na última posição)
		lista.add(new Produto(2, "Mouse", 50));
		for (Produto p : lista) {
			System.out.println(p);
		}
	}
}
