package bytebank_herdado;

//instância de classe usado para carregar o código necessário e lidar com cada interface autenticável
//COMPOSIÇÃO

public class Autenticador {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
}
