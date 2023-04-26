public class Biblioteca {
	public static void main(String[] args) {
		Livro book = new Livro();
		book.setAno(2005);
		book.setAutor("Pedro Lessa");
		book.setCategoria("Carreira");
		book.setEstante(4);
		book.setPrateleira(5);
		book.setTitulo("A verdade sobre o LinkedIn");
		book.setEmprestado(false);
		book.informacoes();
	}
}