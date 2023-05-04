package sintaxe_variaveis_e_fluxo;

public class TesteIR {
	public static void main(String[] args) {
		double salario = 3300.0;
		
		if(salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Seu IR é de 22,5%");
			System.out.println("Você pode deduzir R$ 636.");
		}else if(salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("Seu IR é de 15%");
			System.out.println("Você pode deduzir R$ 350.");
		}else if(salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("Seu IR é de 7,5%");
			System.out.println("Você pode deduzir R$ 142.");
		}
		
	}
}
