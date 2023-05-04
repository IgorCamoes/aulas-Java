package bytebank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Gerente();
		
		funcionario.setNome("Igor");
		
		funcionario.setSalario(1200);
		
		System.out.println("O valor da bonificação de " +funcionario.getNome()+ " é de R$" + funcionario.getBonificacao());
		
		System.out.println("O salario total de " +funcionario.getNome()+ " é R$" + (funcionario.getSalario() + funcionario.getBonificacao()));
		
		

	}

}
