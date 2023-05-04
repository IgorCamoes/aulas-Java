package sintaxe_variaveis_e_fluxo;

public class MultiploDe3 {
	public static void main(String[] args) {
		System.out.println("Multiplos de 3:");
		/*
		 * for(int numero = 1; numero <= 100; numero++) { if(numero % 3 == 0) {
		 * System.out.println(numero); } }
		 */
		
		for(int numero = 3; numero <= 100; numero+=3) {
			System.out.println(numero);
		}
	}
}
