package br.com.universidade.questoes;

public class QuestaoComDica extends QuestaoSimples {
	private String dica;

	public QuestaoComDica(String questao, String resposta, String dica) {
		super(questao, resposta);
		this.dica = dica;
	}

	public String getQuestao() {
		return super.getQuestao() + "\nDica: " + dica;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

}
