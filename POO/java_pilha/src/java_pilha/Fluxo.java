package java_pilha;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exceção: " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	public static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	public static void metodo2() {
		System.out.println("Inicio do metodo2");
		
		throw new MinhaExcecao("Deu ruim!!!!");
		
		//System.out.println("Fim do metodo2");
	}
}
