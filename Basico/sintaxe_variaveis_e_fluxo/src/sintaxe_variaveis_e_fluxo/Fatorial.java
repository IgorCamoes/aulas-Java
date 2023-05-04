package sintaxe_variaveis_e_fluxo;

public class Fatorial {
	public static void main(String[] args) {
//		minha tentativa:
//		int fatorial = 6;
//		int total = 1;
//		for(int n = 1; n <= fatorial; n++) {
//			total = total * n;
//		}
//		System.out.println(fatorial+"! (fatorial) é: " + total);
		
		int fatorial = 1;
		
		for(int i = 1; i < 11; i++) {
			fatorial *= i;
			System.out.println("Fatorial de " +i+ " = " +fatorial);
		}
		
	}
}
