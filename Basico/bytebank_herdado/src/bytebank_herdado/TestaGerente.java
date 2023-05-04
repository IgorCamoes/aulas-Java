package bytebank_herdado;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Jesse");
		
		gerente.setSalario(5000);
		
//		gerente.setSenha(1452);
//		
//		System.out.println(gerente.autentica(1452));
		
		System.out.println(gerente.getBonificacao());

	}

}
