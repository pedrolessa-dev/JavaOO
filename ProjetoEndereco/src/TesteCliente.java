public class TesteCliente {
	public static void main(String[] args) {
		Endereco e1 = new Endereco("Rua", "Ananias Gomes dos Santos", "Apto 21 Bloco C", "12345-678", 401);
//		e1.setTipo("Rua");
//		e1.setLogradouro("Ananias Gomes dos Santos");
//		e1.setNumero(401);
//		e1.setComplemento("Apto 21 Bloco C");
//		e1.setCep("12.345-678");
		Cliente c1 = new Cliente(95842, "Professor Isidro", "isidro@isidro.com", 
				new Endereco("Av","Brasil","Casa 2","12345-987",150));
//		c1.setCodigo(95842);
//		c1.setNome("Professor Isidro");
//		c1.setEmail("isidro@isidro.com");
//		c1.setEndCorrespondencia(e1);
//		System.out.println(c1.exibir());
		System.out.println("Nome do cliente: "+c1.getNome());
		System.out.println("CEP do cliente: "+c1.getEndCorrespondencia().getCep());
		System.out.println("Endereço completo: "+c1.getEndCorrespondencia().exibir());
	}
}