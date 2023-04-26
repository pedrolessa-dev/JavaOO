import java.util.ArrayList;

public class CarrinhoNormal extends CarrinhoAbstrato implements ICarrinho {
	

	public CarrinhoNormal() {
		lista = new ArrayList<Produto>();
	}

	@Override
	public void adicionarProduto(Produto p) {
		super.lista.add(p);
	}

	@Override
	public void totalizarPedido() {
		totalPedido = 0;
		for (Produto p : lista) {
			totalPedido += p.getPreco();
		}
		numParcelas = 5;
		frete = 30;
	}

	public String toString() {
		String res = "Pedido: \nTotal: " + String.format("R$ %.2f%n", totalPedido) + "Frete: "
				+ String.format("R$ %.2f%n", frete) + "Produtos: \n";
		for (Produto p : lista) {
			res += p + "\n";
		}
		return res;
	}

}
