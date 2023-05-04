package bytebank_herdado_conta;

public class Teste {
	public static void main(String[] args) throws SaldoExceptionChecked {
		
		ContaCorrente cc = new ContaCorrente(111, 111111);
		
		cc.depositar(250);
		
		ContaPoupanca contaP = new ContaPoupanca(222, 222222);
		
		contaP.depositar(200);
		
		contaP.getTitular().setNome("Igor");
		
		cc.transfere(25, contaP);
		
		cc.extrato();
		contaP.extrato();
	}
}
