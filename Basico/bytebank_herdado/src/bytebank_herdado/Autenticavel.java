package bytebank_herdado;

// interface é um conjunto abstrato de métodos abstratos, ela não deve ter nada concreto dentro dela, pois todas as classes que interagirem com ela deve implementar os métodos da maneira certa.

// pode-se ter multiplas implementações de interfaces em uma classe, porém, uma classe pode herdar somente filho de apenas uma classe Mãe.

public abstract interface Autenticavel{

	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
