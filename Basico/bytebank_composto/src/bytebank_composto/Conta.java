package bytebank_composto;


public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular = new Cliente();
	
	public void extrato() {
		System.out.println("Saldo disponível de R$" + this.saldo);
	}
	
	public void depositar(double valor){
		this.saldo += valor;
		System.out.println("Foram depositados R$" + valor);
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
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("Foram transferidos R$" +valor+ " da sua conta para a conta: " +destino.numero+ ". (" +destino.titular.nome+ ")" );
			
			return true;
		}else {
			System.out.println("Saldo insuficiente para transferência.");
			return false;
		}
	}
}
