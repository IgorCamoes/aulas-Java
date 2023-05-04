package gerenciador_de_cursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public List<Aula> getAulas(){
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		
		//return this.aulas.stream().mapToInt(Aula::getTempo).sum();
		
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "[Curso: " +nome+ ", Tempo total: " +this.getTempoTotal()+"]";
	}

	public void matricula(Aluno aluno) {
		
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
		
	}
	
	public boolean matriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public Aluno buscaMatriculado(int matricula) {
		
		if(matricula == 0) {
			throw new NullPointerException("Por favor, insira um nome ou número de matrícula para pesquisar.");
		}
		
		if(!matriculaParaAluno.containsKey(matricula)) {
			throw new NoSuchElementException("Nenhum aluno encontrado.");
		}
		
		return matriculaParaAluno.get(matricula);
		
	}
}
