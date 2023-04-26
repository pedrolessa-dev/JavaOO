
public class Agenda {
	public static void main(String[] args) {
		Contato lista[];
		lista = new Contato[5];
		lista[0] = new Contato("José", "jose@gmail.com", "11995544556");
		lista[1] = new Contato("Pedro", "pedro@gmail.com", "22994534556");
		lista[2] = new Contato("Ana", "ana@gmail.com", "31995565456");
		lista[3] = new Contato("Paula", "paula@gmail.com", "45997894556");
		lista[4] = new Contato("João", "joao@gmail.com", "88991328556");
//		for (int pos = 0; pos <= 4; pos++) {
//			System.out.println(lista[pos].exibir());
//		}
		for (Contato c : lista) {
			System.out.println(c.exibir());
		}
	}
}
