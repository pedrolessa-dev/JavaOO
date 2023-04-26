package br.com.filmes.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitor {
	public ArrayList<Filme> lerAcervo(String nome) throws IOException {

		ArrayList<Filme> lista = new ArrayList<Filme>();
		File f = new File(nome);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linha;
		try {
			do {
				linha = br.readLine();
				if (linha != null) {
					String dados[] = linha.split(";");
					Filme filme = new Filme();
					filme.setAno(Integer.parseInt(dados[1]));
					filme.setNome(dados[0]);
					filme.setGenero(dados[2]);
					filme.setDuracao(Integer.parseInt(dados[3]));
					filme.setClassificacao(Double.parseDouble(dados[4]));
					lista.add(filme);
				}
			} while (linha != null);
			br.close();
			fr.close();
			return lista;
		} catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		}
		return null;
	}
}
