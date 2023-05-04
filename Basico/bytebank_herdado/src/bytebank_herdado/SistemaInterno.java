package bytebank_herdado;

public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(Autenticavel f) {
		f.autentica(this.senha);
		
		if(f.autentica(this.senha)) {
			System.out.println("Pode entrar no sistema.");
		}else {
			System.out.println("Não pode entrar no sistema.");
		}
	}
	
}
