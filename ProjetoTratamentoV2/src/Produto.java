
public class Produto {
	private int id;
	private String nome;
	private double preco;

	
	
	@Override
	public String toString() {
		return "#" + id + " - " + nome + String.format(" (R$ %.2f)", preco);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) throws MyException {
		if (id <= 0) {
			throw new MyException("ID não pode ser menor ou igual a zero");
		}
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws MyException {
		if (nome == null || nome.length() == 0) {
			throw new MyException("Nome precisa ser preenchido");
		}
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws MyException {
		if (preco < 0) {
			throw new MyException("Preço não pode ser negativo");
		}
		this.preco = preco;
	}

}
