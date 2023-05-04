package bytebank_herdado_conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void saca(double valor){
		super.saca(valor+0.40);
	}

}
