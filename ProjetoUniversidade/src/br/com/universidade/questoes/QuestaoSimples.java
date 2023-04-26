package br.com.universidade.questoes;

public class QuestaoSimples {
	protected String questao;
	protected String resposta;
	protected double nota;

	public QuestaoSimples(String questao, String resposta) {
		super();
		this.questao = questao;
		this.resposta = resposta;
	}

	public boolean corrigir(String resposta) {
		return this.resposta.equals(resposta);
		}

	public String getQuestao() {
		return questao;
	}

	public void setQuestao(String questao) {
		this.questao = questao;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
