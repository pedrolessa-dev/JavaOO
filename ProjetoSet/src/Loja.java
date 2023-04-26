import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Loja {
	public static void main(String[] args) {
		/* 
		 * A diferença entre ArrayList e HashSet é:
		 * no HashSet não pode haver dois objetos da mesma classe que tenham 
		 * mais de 1 dados iguais
		 * Exemplo: não pode haver dois CPFs iguais, e-mails iguais, 
		 * códigos de produtos igausis, etc.
		 */
		HashSet<Produto> lista = new HashSet<Produto>();
		lista.add(new Produto(1, "Computador", 1500));
		lista.add(new Produto(1, "Computador", 1500));
		lista.add(new Produto(1, "Computador", 1500));
		lista.add(new Produto(1, "Teclado", 30));
		lista.add(new Produto(10, "Mouse", 50));
		lista.add(new Produto(25, "Impressora", 400));

		// Exibir a lista com while (vai ignorar posições iguais)
//		Iterator<Produto> it = lista.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		// Percorrer lista onde as posições não são necessariamente sequenciais
		Iterator<Produto> it = lista.iterator();
		// Enqaunto tiver um próximo elemento a ser consultado
		while (it.hasNext()) {
			// Exiba esse elemento
			System.out.println(it.next());
		}
		
		/*
		 * Não dá para percorrer a lista com o "for" normal
		 * Apenas com o "for-each"
		 * Pois eu uso internamente equivalente ao código anterior (com o iterator)
		 */
//		for (Produto p : lista) {
//			System.out.println(p);
//		}
		
		// Neste caso pode ser feito com iterator ou for-each
		
		System.out.println("--------------------------");
		
		// HashMap não vai desconsiderar os dados iguais
		// Integer é a forma de escrever int no HashMap
		HashMap<Integer, Produto> mapa = new HashMap<Integer, Produto>();
		mapa.put(1, new Produto(1, "Computador", 1500));
		mapa.put(2, new Produto(1, "Computador", 1500));

		// HashMap só aceita iterator
		Iterator<Produto> it2 = mapa.values().iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("--------------------------");
		
		// Exemplo prático com ações
		HashMap<String, Double> cotacoes = new HashMap<String, Double>();
		cotacoes.put("ITUB4", 30.35);
		cotacoes.put("PETR3", 22.40);
		cotacoes.put("VALE4", 30.35);
		Iterator<Double> it3 = cotacoes.values().iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		System.out.println("--------------------------");
		
		// o HashMap subistitui se o primeiro dado for igual a um já existente
		// Já o HashSet cria um outro objeto em uma posição diferente
		// atualizando o valor da cotação
		cotacoes.put("ITUB4", 51.60);
		Iterator<Double> it4 = cotacoes.values().iterator();
		while (it4.hasNext()) {
			System.out.println(it4.next());
		}
	}
}
