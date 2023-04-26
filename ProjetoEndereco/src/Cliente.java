
public class Cliente {
	private int codigo;
	private String nome;
	private String email;
	private Endereco endCorrespondencia;

	public Endereco getEndCorrespondencia() {
		return endCorrespondencia;
	}

	public void setEndCorrespondencia(Endereco endCorrespondencia) {
		this.endCorrespondencia = endCorrespondencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String exibir() {
		return "Cliente: " + codigo + " - " + nome + " (" + email + ")\nEndereço: " + endCorrespondencia.exibir();
	}

	public Cliente(int codigo, String nome, String email, Endereco endCorrespondencia) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.endCorrespondencia = endCorrespondencia;
	}

}
