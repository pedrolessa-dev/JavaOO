import java.util.ArrayList;

public abstract class CarrinhoAbstrato {
	protected ArrayList<Produto> lista;
	protected int numParcelas;
	protected double totalPedido;
	protected double frete;
	
	public CarrinhoAbstrato() {
		lista = new ArrayList<Produto>();
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
