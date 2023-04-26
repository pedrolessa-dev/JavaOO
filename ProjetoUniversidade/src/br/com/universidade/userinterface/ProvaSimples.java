package br.com.universidade.userinterface;

import java.util.ArrayList;
import java.util.Scanner;
import br.com.universidade.questoes.QuestaoComDica;
import br.com.universidade.questoes.QuestaoMultiplaEscolha;
import br.com.universidade.questoes.QuestaoSimples;

public class ProvaSimples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<QuestaoSimples> questoes = new ArrayList<QuestaoSimples>();
		String resp;
		int nota = 0, num = 1;
		questoes.add(new QuestaoSimples("Quanto é 2 + 2?", "4"));
		questoes.add(
				new QuestaoComDica("Qual a cor do cavalo Branco de Napoleão?", "Marrom", "Não confunda nome com cor"));
		questoes.add(new QuestaoSimples("Quem descobriu o Brasil", "Pedro Álvares Cabral"));
		questoes.add(new QuestaoComDica("Qual a linguagem deste programa?", "Java", "Foi criada em 1995 e hoje é propriedade da Oracle"));
		questoes.add(new QuestaoSimples("Qual a fórmula da água?", "H2O"));
		questoes.add(new QuestaoMultiplaEscolha("Qual a cor do céu?", "b", "Amarelo", "Azul", "Verde", "Vermelho"));
		questoes.add(new QuestaoMultiplaEscolha("Qual o nome do progrma usado para versionamento local de códigos?",
				"d", "Version Program", "GitHub", "Java SE", "Git"));
		questoes.add(new QuestaoSimples("Em que ano o Brasil foi penta campeão?", "2002"));
		questoes.add(new QuestaoComDica("Qual o símbolo para indicar resto da divisão em Java?", "%",
				"Não confunda divisão com resto da divisão"));
		questoes.add(new QuestaoMultiplaEscolha("Quanto é 5²?", "b", "10", "25", "5", "n.d.a"));
		for (QuestaoSimples q : questoes) {
			System.out.println("Questão "+num+": "+q.getQuestao());
			num++;
			resp = sc.nextLine();
			if (q.corrigir(resp)) {
				System.out.println("(✓) Acertou");
				nota++;
			} else {
				System.out.println("(X) Errou");
			}
		}
		System.out.println("\nNota final: " + nota);
		sc.close();
	}
}
