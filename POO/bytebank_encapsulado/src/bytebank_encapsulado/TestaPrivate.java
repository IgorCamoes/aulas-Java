package bytebank_encapsulado;

public class TestaPrivate {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		Conta conta2 = new Conta();
		
		conta2.getTitular().setNome("Igor Camões");
		
		conta.setAgencia(45);
		
		conta2.setNumero(1337);
		
		conta.depositar(500);
		
		conta.transfere(250, conta2);
		
		conta2.saca(50);
		
		conta.extrato();
		
		conta2.extrato();
		
	}
}
