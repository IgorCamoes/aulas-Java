package bytebank_composto;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente igor = new Cliente();
		
		igor.nome = "Igor Camões";
		igor.cpf = "222.222.222-22";
		igor.profissao = "Programador";
		
		Conta contaDoIgor = new Conta();
		
		contaDoIgor.depositar(500);
		
	}
}
