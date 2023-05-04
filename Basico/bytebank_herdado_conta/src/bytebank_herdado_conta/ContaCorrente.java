package bytebank_herdado_conta;

public class ContaCorrente extends Conta implements Tributavel{
	
	

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor){
		super.saca(valor+0.20);
	}
	
	@Override
	public double getValorImposto() {
		
		return super.saldo * 0.01;
	}
}
