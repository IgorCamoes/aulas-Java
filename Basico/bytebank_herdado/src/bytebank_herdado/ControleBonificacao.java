package bytebank_herdado;

public class ControleBonificacao {
	
	private double soma;
	
	
	public void registra(Funcionario f) {
		this.soma = this.soma + f.getBonificacao();
	}
	
	public double getSoma() {
		return soma;
	}
	
}
