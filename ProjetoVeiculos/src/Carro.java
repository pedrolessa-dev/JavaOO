
public class Carro extends Veiculo {
	private String modelo;

	public Carro(String marca, String modelo) {
		super(marca);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void acelerar() {
		System.out.println("Carro " + this.modelo + " acelera no pé");
	}

	@Override
	public void frear() {
		System.out.println("Carro " + this.modelo + " freia na mão");
	}

}
