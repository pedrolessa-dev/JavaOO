
public class Endereco {
	private String tipo;
	private String logradouro;
	private String complemento;
	private String cep;
	private int numero;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String exibir() {
		return tipo + ": " + logradouro + " Num: " + numero + "\nCompl: " + complemento + " - CEP: " + cep;
	}

	public Endereco(String tipo, String logradouro, String complemento, String cep, int numero) {
		this.tipo = tipo;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cep = cep;
		this.numero = numero;
	}
}
