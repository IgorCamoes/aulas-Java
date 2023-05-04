package bytebank_poo;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 300;
		
		//cria uma segunda variável com a mesma referência da primeira, existem 2 variáveis com a mesma referência para a mesma conta. 
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo += 200;
		
		System.out.println("Saldo da primeira conta: " +primeiraConta.saldo);
		System.out.println("Saldo da segunda conta: " +segundaConta.saldo);
		
		System.out.println();
		
		//prova de serem a mesma referência em duas variáveis diferentes:
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta.");
		}
	}
}
