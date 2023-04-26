package br.com.cartoes.core;

public class CartaoCashBack extends CartaoPrePago {
	private int tipoCartao;

	public CartaoCashBack(String numCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipoCartao) {
		super(numCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipoCartao = tipoCartao;
	}

	public boolean comprar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			if (this.tipoCartao == 1) {
				saldo += valor * 0.02;
			} else if (this.tipoCartao == 2) {
				saldo += valor * 0.05;
			} else {
				saldo += valor * 0.08;
			}
			System.out.println("Pagamento realizado com sucesso, seu cashback já foi incluído ao seu saldo");
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public int getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(int tipoCartao) {
		this.tipoCartao = tipoCartao;
	}
}
