package bytebank_poo;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.titular = "Igor Camões";
		
//		conta.saldo += 50;
//		
//		conta.extrato();
//		
//		conta.depositar(100);
//		
//		conta.extrato();
//		
//		conta.saca(300);
//		
//		conta.extrato();
		
		conta.depositar(300);
		
		Conta conta2 = new Conta();
		
		conta2.numero = 4054;
		
		conta2.titular = "Jiafei";
		
		conta.transfere(500, conta2);
		
		conta.extrato();
		
		conta2.extrato();
		
		
		
	}
	
}
