package sintaxe_variaveis_e_fluxo;

public class TestaLacos {
	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <=10; multiplicador++) {
			System.out.println("Tabuada do " + multiplicador);
			for(int contador = 1; contador <=10; contador++) {
				System.out.print(contador * multiplicador);
				System.out.print(" ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
