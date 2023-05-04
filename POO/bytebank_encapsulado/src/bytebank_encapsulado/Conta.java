package bytebank_encapsulado;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total;
	
	
	public Conta() {
		total++;
	}
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando a conta de número " +numero+ " e agência " +agencia);
		
		
		total++;
	}
	
	
	public void extrato() {
		System.out.println("Saldo disponível de R$" + this.saldo);
	}
	
	public void depositar(double valor){
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("Foram depositados R$" + valor + " na sua conta.");
		}else {
			System.out.println("Valor de depósito inválido.");
		}
		
		
	}
	
	public boolean saca(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
			
			System.out.println("O valor de R$" +valor+ " foi sacado.");
			
			return true;
		}else {
			System.out.println("Saldo insuficiente, você tem apenas " + this.saldo + " na conta.");
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta destino){
		if(destino.getTitular() != this.titular) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				destino.saldo += valor;
				if(destino.getTitular().getNome() != null && destino.getNumero() != 0) {
					System.out.println("Foram transferidos R$" +valor+ " da sua conta para a conta: " +destino.numero+ ". (" +destino.titular.getNome()+ ")" );
				}
				
				System.out.println("Foram transferidos R$" +valor);
				
				return true;
			}else {
				System.out.println("Saldo insuficiente para transferência.");
				return false;
			}
		}
		
		System.out.println("Você não pode realizar transferências para a mesma conta.");
		return false;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int novaAgencia) {
		this.agencia = novaAgencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
}
