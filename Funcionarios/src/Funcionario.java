
public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;

	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public Funcionario(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = 0;
	}

	public Funcionario(String nome) {
		this.nome = nome;
		this.cargo = "*Não atribuído*";
		this.salario = 0;
	}
	
	public Funcionario() {
		this.cargo = "*Não atribuído*";
		this.salario = 0;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String imprimir() {
		return "Funcionário: " + nome + " (" + cargo + ") R$ " + String.format("%.2f", salario);
	}

	public double aumentarSalario(double percentual) {
		double aumento = salario * percentual / 100;
		return aumento;
	}
}