package sintaxe_variaveis_e_fluxo;

public class TestaFor {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int contador = 0; contador <= 15; ++contador) {
			total+=contador;
			
			System.out.println(total);
		}
		
	}
}
