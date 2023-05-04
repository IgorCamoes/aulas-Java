package bytebank_herdado;

public class Administrador extends Funcionario implements Autenticavel{
	
	private Autenticador auth;
	
	public Administrador() {
		this.auth = new Autenticador();
	}

	@Override
	public double getBonificacao() {
		return 50;
	}
	
	@Override
	public void setSenha(int senha) {
		this.auth.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.auth.autentica(senha);
	}
	

}
