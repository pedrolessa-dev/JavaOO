import java.util.ArrayList;

public class CarrinhoPromocional extends CarrinhoAbstrato implements ICarrinho {
	private double desconto;

	@Override
	public void adicionarProduto(Produto p) {
		super.lista.add(p);
	}

	@Override
	public void totalizarPedido() {
		super.totalPedido = 0;
		for (Produto p : super.lista) {
			super.totalPedido += p.getPreco();
		}
		if (super.totalPedido >= 1500) {
			super.frete = 0;
			super.numParcelas = 10;
		} else {
			super.frete = 20;
			super.numParcelas = 5;
		}
	}
}
