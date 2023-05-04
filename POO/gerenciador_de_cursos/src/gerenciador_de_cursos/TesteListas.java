package gerenciador_de_cursos;

import java.util.*;

public class TesteListas {

	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de Listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula no Relativo A For-in: " + aula);
		}
		
		System.out.println("");
		
		aulas.add("Aumentando nosso conhecimento");
		
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula atual no for normal: " + aulas.get(i));
		}
		
		System.out.println("");
		
		Collections.sort(aulas);
		
		aulas.forEach(aula -> {
			System.out.println("Aula atual no forEach: " + aula);
		});
		
		System.out.println("");
		
		System.out.println(aulas.size());
		
		aulas.remove(1);
		
		System.out.println(aulas);
		
		aulas.remove(aula3);
		
		System.out.println(aulas);
		
		
		
	}

}
