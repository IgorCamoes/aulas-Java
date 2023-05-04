package bytebank_poo;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200.0;
		
		System.out.println("Saldo da primeira conta: R$"+primeiraConta.saldo);
		
		primeiraConta.saldo += 100.0;
		
		System.out.println("Saldo da primeira conta: R$"+primeiraConta.saldo);
		
		
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo += 50;
		
		System.out.println("Saldo da segunda conta: R$"+segundaConta.saldo);
		
		System.out.println(segundaConta.titular);
		
		System.out.println();
		
		System.out.println("Referencias:");
		
		System.out.println(primeiraConta);
		
		System.out.println(segundaConta);
		
		System.out.println();
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta.");
		}else {
			System.out.println("São contas diferentes");
		}
	}
}
