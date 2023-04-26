package br.com.filmes.userinterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.filmes.core.Escritor;
import br.com.filmes.core.Filme;
import br.com.filmes.core.Leitor;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int opcao, ano, duracao;
		String nome, genero;
		double classificacao;
		do {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println(
					"1 - Cadastrar novo filme\n2 - Exibir todo o acervo\n3 - procurar filme por palavra chave\n0 - Sair");
			opcao = Integer.parseInt(sc.nextLine());
			switch (opcao) {
			case 1:
				Filme filme = new Filme();
				System.out.println("Digite o nome do filme:");
				nome = sc.nextLine();
				filme.setNome(nome);
				System.out.println("Digite o ano do filme:");
				ano = Integer.parseInt(sc.nextLine());
				filme.setAno(ano);
				System.out.println("Digite o genero do filme:");
				genero = sc.nextLine();
				filme.setGenero(genero);
				System.out.println("Digite a duração em minutos do filme:");
				duracao = Integer.parseInt(sc.nextLine());
				filme.setDuracao(duracao);
				System.out.println("Digite a classificação do filme:");
				classificacao = Double.parseDouble(sc.nextLine());
				filme.setClassificacao(classificacao);
				Escritor es = new Escritor();
				es.gravarFilme("filmes.csv", filme);
				break;
			case 2:
				Leitor l = new Leitor();
				ArrayList<Filme> lista = l.lerAcervo("filmes.csv"); 
				System.out.println("seu acervo");
				if (lista != null) {
					for (Filme f : lista) {
						System.out.println(f);
					}
				}
				break;
			case 3:
				System.out.println("- Digite a palavra chave");
				String palavraChave = sc.nextLine();
				Leitor le = new Leitor();
				ArrayList<Filme> conjunto = le.lerAcervo("filmes.csv");
				for (Filme f : conjunto) {
					if (f.getNome().toUpperCase().contains(palavraChave.toUpperCase())) {
						System.out.println(f);
					}
				}
				break;
			case 0:
				System.out.println("saindo");
				System.exit(0);
			default:
				System.out.println("opção inválida");
			}
		} while (opcao != 0);
		sc.close();
	}
}
