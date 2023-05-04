package sintaxe_variaveis_e_fluxo;

public class TestaConversao {

	public static void main(String[] args) {
		
		//casting || variáveis referência
		
		double salario = 1270.50;
		
		int valor = (int) salario;
		
		System.out.println(salario);
		System.out.println(valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		
		double total = valor1 + valor2;
		
		System.out.println(total);
		
		
		//tipos numéricos
		
		//int = 32bits 2bilhões de caracteres
		//long = 64bits 2bilhões² "long exemplo = 1239184l; < precisa do l no final para não ser considerado int
		//short = 16bits
		//byte = 127 ou -126;
		
		//float = float exemplo = 3.14f; < precisa do f no final para não ser considerado double
		
	}
	
}
