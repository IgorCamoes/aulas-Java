package bytebank_herdado_conta;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(6, 748374);
		
		cc.depositar(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoraImposto calc = new CalculadoraImposto();
		
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());
		
	}

}
