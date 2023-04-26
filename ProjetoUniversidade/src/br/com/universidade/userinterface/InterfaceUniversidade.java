package br.com.universidade.userinterface;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.universidade.questoes.QuestaoComDica;
import br.com.universidade.questoes.QuestaoMultiplaEscolha;
import br.com.universidade.questoes.QuestaoSimples;

public class InterfaceUniversidade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		float nota = 0;
		String resposta;
		System.out.println("==========================");
		System.out.println("Prova de raciocínio lógico");
		System.out.println("==========================\n");
		ArrayList<QuestaoSimples> questoes = new ArrayList<QuestaoSimples>();
		questoes.add(
				new QuestaoSimples("Descubra a lógica e complete o próximo número:\n2, 4, 8, 16, 32, 64, ...", "128"));
		questoes.add(new QuestaoMultiplaEscolha(
				"(FGV/TRT-SC) Alguns consideram que a cidade de Florianópolis \nfoi fundada no dia 23 de março de 1726, que caiu em um sábado. Após 90 dias, \nno dia 21 de junho, a data assinalou o início do inverno, quando a noite é a mais \nlonga do ano. Esse dia caiu em uma:",
				"d", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"));
		questoes.add(new QuestaoComDica(
				"João acordou atrasado para o trabalho, e verificou que o tempo restante \naté o final do dia era igual à metade do tempo já decorrido do dia.\nCom base nessas informações, concluímos que ele acordou às:",
				"16", "O final do dia é às 24h."));
		questoes.add(new QuestaoMultiplaEscolha("Todo cachorro é um animal, logo:", "c",
				"Todo rabo de animal é também rabo de cachorro.", "Todo animal é um cachorro.",
				"Toda pata de cachorro é uma pata de um animal.", "Nem todo cachorro é um animal."));
		questoes.add(new QuestaoMultiplaEscolha(
				"Se toda criança é jovem e nenhum jovem é feio, então podemos concluir que:", "d",
				"Toda criança é feia.", "Nenhum jovem é criança.", "Todo jovem é criança.", "Nenhuma criança é feia."));
		questoes.add(new QuestaoSimples("Descubra a lógica e complete a próxima sequência:\nMCD, NEF, OGH, ... , QKL",
				"PIJ"));
		questoes.add(new QuestaoMultiplaEscolha("A negação de “hoje é segunda-feira e amanhã não choverá” é:", "b",
				"hoje não é segunda-feira e amanhã não choverá.", "hoje não é segunda-feira ou amanhã choverá.",
				"hoje é segunda-feira ou amanhã choverá.", "hoje não é segunda-feira nem amanhã choverá."));
		questoes.add(new QuestaoComDica(
				"Uma loja está vendendo um refrigerador no valor de R$ 2.600,00\ncom 25% de desconto na condição de parcelamento em seis vezes fixas.\nQual será o valor de cada parcela se esse refrigerador for comprado conforme\na condição exposta?",
				"325", "Considere utilizar a regra de três."));
		questoes.add(new QuestaoMultiplaEscolha("“Cabeça” está para “Pé” assim como “Teto” está para:", "a", "Chão.",
				"Telhado.", "Janela.", "Parede."));
		questoes.add(new QuestaoMultiplaEscolha(
				"Coloque as Palavras na Ordem Correta:\nNeném(1) - Velho(2) - Adolescente(3) - Adulto(4):", "c",
				"4 - 3 - 2 - 1.", "1 - 2 - 4 - 3.", "1 - 3 - 4 - 2.", "1 - 4 - 3 - 2."));
		for (QuestaoSimples q : questoes) {
			System.out.println("Questão " + num + " - " + q.getQuestao());
			num++;
			resposta = sc.nextLine();
			if (q.corrigir(resposta)) {
				System.out.println("(✓) Resposta correta!\n");
				nota++;
			} else {
				System.out.println("(X) Resposta incorreta.\n");
			}
		}
		System.out.println("Você terminou essa prova\nNota final: " + nota);
		if (nota >= 7) {
			System.out.println("Parabéns você foi aprovado!");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Você ficou em recuperação");
		} else {
			System.out.println("Você foi reprovado");
		}
		sc.close();
	}
}
