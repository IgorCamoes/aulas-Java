package bytebank_herdado_conta;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.depositar(200);
		
		try {
			conta.saca(210);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		conta.extrato();
	}
	
}
