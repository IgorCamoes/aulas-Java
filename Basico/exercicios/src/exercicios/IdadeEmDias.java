package exercicios;

import java.util.*;

public class IdadeEmDias {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		
		int anos = sc.nextInt();
		
		System.out.println("Quantos meses desde o seu último aniversário?");
		
		int meses = sc.nextInt();
		
		System.out.println("Hoje é que dia do mês?");
		
		int dias = sc.nextInt();
		
		int totalDeDias = (anos*365) + (meses*30) + dias;
		
		System.out.println("O total da sua idade em dias é: " + totalDeDias);
		
		sc.close();
		
	}
}
