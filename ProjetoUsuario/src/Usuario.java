
public class Usuario {
	private String login;
	private String senha;
	private Permissao permissao;

	public Usuario(String login, String senha, Permissao permissao) {
		super();
		this.login = login;
		this.senha = senha;
		this.permissao = permissao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}

}
