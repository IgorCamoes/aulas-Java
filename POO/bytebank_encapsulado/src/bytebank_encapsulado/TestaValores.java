package bytebank_encapsulado;

public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.depositar(40);
		
		conta.extrato();
		
		Conta conta2 = new Conta(1337, 2442);
		
		conta2.depositar(340);
		
		conta2.extrato();
		
		conta2.transfere(40, conta2);
		
		conta2.transfere(40, conta);
		
		System.out.println(Conta.getTotal());

	}

}