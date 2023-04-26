
public class Loja {
	public static void main(String[] args) {
		
		// declaração e instanciação do objeto
		Carro c1 = new Carro();
		c1.setMarca("Chevrolet");
		c1.setModelo("Corsa");
		c1.setAno(2002);
		c1.setCor("Vermelho com vermelho fosco");
		c1.setPreco(6800);
		
		Carro c2 = new Carro();
		c2.setMarca("Porsche");
		c2.setModelo("Cayenne");
		c2.setAno(2023);
		c2.setCor("Prata");
		c2.setPreco(2500000);
		
		System.out.println("*** ISIMotors ***\n");
		c1.exibirAnuncio();
		System.out.printf("O valor do seguro para jovens é: R$ %.2f%n", c1.calcularSeguro(0));
		System.out.printf("O valor do seguro para adultos é: R$ %.2f%n", c1.calcularSeguro(1));
		System.out.printf("O valor do seguro para idosos é: R$ %.2f%n%n", c1.calcularSeguro(2));
		
		c2.exibirAnuncio();
		System.out.printf("O valor do seguro para jovens é: R$ %.2f%n", c2.calcularSeguro(0));
		System.out.printf("O valor do seguro para adultos é: R$ %.2f%n", c2.calcularSeguro(1));
		System.out.printf("O valor do seguro para idosos é: R$ %.2f%n%n", c2.calcularSeguro(2));
	}
}