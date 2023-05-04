package sintaxe_variaveis_e_fluxo;

public class TesteCondicional {
	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadePessoas = 1;

		if (idade >= 18) {
			System.out.println("Você é maior de idade");
			System.out.println("Boas vindas!");
		} else if(idade < 18 && quantidadePessoas > 1){
			System.out.println("Você é menor de idade");
			System.out.println("Porém, está está com mais pessoas, boas vindas!");
		}else {
			System.out.println("Você é menor de idade");
			System.out.println("Redirecionando para outro site...");
		}
	}
}