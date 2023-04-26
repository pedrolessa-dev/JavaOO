
public class Permissao {
	private int codigoPermissao;
	private String nomePermissao;

	public Permissao(int codigoPermissao, String nomePermissao) {
		super();
		this.codigoPermissao = codigoPermissao;
		this.nomePermissao = nomePermissao;
	}

	public String exibir() {
		return "Nome: " + nomePermissao + " - " + codigoPermissao;
	}

	public int getCodigoPermissao() {
		return codigoPermissao;
	}

	public void setCodigoPermissao(int codigoPermissao) {
		this.codigoPermissao = codigoPermissao;
	}

	public String getNomePermissao() {
		return nomePermissao;
	}

	public void setNomePermissao(String nomePermissao) {
		this.nomePermissao = nomePermissao;
	}

}
