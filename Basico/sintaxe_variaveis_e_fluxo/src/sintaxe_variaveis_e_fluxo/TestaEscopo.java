package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		if(quantidadePessoas >=2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		
		

		if (idade >= 18) {
			System.out.println("Você é maior de idade");
			System.out.println("Boas vindas!");
		} else if(idade < 18 && acompanhado){
			System.out.println("Você é menor de idade");
			System.out.println("Porém, está está com mais pessoas, boas vindas!");
		}else {
			System.out.println("Você é menor de idade");
			System.out.println("Redirecionando para outro site...");
		}

	}

}
