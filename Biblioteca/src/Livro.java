public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private String categoria;
	private int estante;
	private int prateleira;
	private boolean emprestado;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public int getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	void informacoes() {
		System.out.println("Livro: " + titulo + " (" + ano + ")");
		System.out.println("Autor: " + autor);
		System.out.println("Categoria: " + categoria);
		System.out.println("Posição: E" + estante + " P" + prateleira);
		if (emprestado == true) {
			System.out.println("Este livro já foi emprestado");
		} else {
			System.out.println("Este livro está disponível");
		}
	}
}