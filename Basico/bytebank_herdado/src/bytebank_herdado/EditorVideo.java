package bytebank_herdado;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		//super significa que o atributo usado no filho é herdado da classe mãe
		return 100;
	}
}
