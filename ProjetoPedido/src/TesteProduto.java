public class TesteProduto {
	public static void main(String[] args) {
		Produto prod1 = new Produto(123, "Mouse", 49.9);
		Cliente c1 = new Cliente("Pedro", "123.456.789-00", "pedro@gmail.com");
		Pedido p1 = new Pedido(65782, "15/02/2023", 49.9, c1, prod1);
		System.out.println(p1.exibir());
		Produto prod2 = new Produto(124, "Teclado", 35.59);
		Cliente c2 = new Cliente("Isidro", "321.654.789-00", "isidro@hotmail.com");
		Pedido p2 = new Pedido(65783, "14/02/2023", 35.59, c2, prod2);
		System.out.println(p2.exibir());
	}
}