public class Universidade {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("José", "jose@gmail.com", "24995353534");
//		p.setNome("José");
//		p.setEmail("jose@gmail.com");
//		p.setTelefone("24995353534");
		System.out.println(p);
		Aluno a = new Aluno("João", "joao@gmail.com", "22999721530", 48324);
//		a.setNome("João");
//		a.setEmail("joao@gmail.com");
//		a.setTelefone("22999721530");
//		a.setNumeroMatricula(48324);
		System.out.println(a);
		Pessoa p1, p2;
		p1 = new Pessoa("Zezinho", "ze@ze.com", "12345");
		p2 = new Aluno("Joaozinho", "jao@jao.com", "54321", 35715);
		System.out.println("\n" + p1);
		System.out.println(p2);
	}
}