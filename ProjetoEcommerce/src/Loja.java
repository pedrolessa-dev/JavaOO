
public class Loja {
	public static void main(String[] args) {
//		ICarrinho ic = new CarrinhoNormal();
		ICarrinho ic = new CarrinhoPromocional();
		ic.adicionarProduto(new Produto(1, "Computador", 1690.9));
		ic.adicionarProduto(new Produto(2, "Teclado", 69.9));
		ic.adicionarProduto(new Produto(3, "Monitor", 325));
		ic.adicionarProduto(new Produto(4, "Mouse", 32.5));
		ic.totalizarPedido();
		System.out.println(ic);
	}
}
