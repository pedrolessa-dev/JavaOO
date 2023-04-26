package br.com.filmes.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritor {
	public void gravarFilme(String nomeArquivo, Filme filme) throws IOException {
		try {
		File f = new File(nomeArquivo);
		FileWriter fr = new FileWriter(f, true);
		PrintWriter pr = new PrintWriter(fr);
		pr.println(filme.toCSV());
		fr.close();
		pr.close();
		}catch(IOException e) {
			System.out.println("erro: "+e.getMessage());
		}
	}


}
