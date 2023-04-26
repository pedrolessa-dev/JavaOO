package br.com.filmes.core;

public class Filme {
	private String nome;
	private int ano;
	private String genero;
	private int duracao;
	private double classificacao;

//	public Filme(String nome, int ano, String genero, int duracao, double classificacao) {
//		super();
//		this.nome = nome;
//		this.ano = ano;
//		this.genero = genero;
//		this.duracao = duracao;
//		this.classificacao = classificacao;
//	}

	public String toString() {
		return "Filme: " + nome + "(" + ano + ") Gênero: " + genero + "\n" + duracao + "min Classificação: "
				+ classificacao;
	}

	public String toCSV() {
		return nome + ";" + ano + ";" + genero + ";" + duracao + ";" + classificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public double getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(double classificacao) {
		this.classificacao = classificacao;
	}

}
