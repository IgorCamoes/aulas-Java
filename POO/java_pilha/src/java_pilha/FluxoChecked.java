package java_pilha;

public class FluxoChecked {
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
	
	public static void metodo1() throws MinhaExcecaoChecked {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	public static void metodo2() throws MinhaExcecaoChecked {
		System.out.println("Inicio do metodo2");
		
		throw new MinhaExcecaoChecked("Deu ruim mas avisei!");
		
		//System.out.println("Fim do metodo2");
	}
}
