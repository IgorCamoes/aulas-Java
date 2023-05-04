package bytebank_herdado;

public class TesteReferencias {

	public static void main(String[] args) {

		//todo gerente É um funcionario, mas nem todo funcionario é um gerente
		Gerente gerente = new Gerente();
		
		gerente.setNome("Testildo");
		gerente.setSalario(5000);
		
		Designer designer = new Designer();
		
		designer.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		
		ev.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(gerente);
		controle.registra(ev);
		controle.registra(designer);
		
		System.out.println(controle.getSoma());

	}

}
