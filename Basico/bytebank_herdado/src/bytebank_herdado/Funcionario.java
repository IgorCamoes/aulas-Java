package bytebank_herdado;

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	//protected = publico apenas para os filhos
	private double salario; 
	
	public Funcionario() {
		
	}
	
	//método abstrato é um método que não tem corpo na classe Mãe, porém pode ser usado de forma polimorfada e herdada pelas classes filhas. Dito isso, as classes filhas PRECISAM implementar esse método para poder compilar.
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}