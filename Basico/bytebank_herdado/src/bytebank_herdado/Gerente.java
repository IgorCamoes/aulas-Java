package bytebank_herdado;

public class Gerente extends Funcionario implements Autenticavel{
	
	private Autenticador auth;
	
	public Gerente() {
		this.auth = new Autenticador();
	}
	
	public double getBonificacao() {
		//super significa que o atributo ou método usado no filho é herdado da classe mãe
		return super.getSalario();
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
