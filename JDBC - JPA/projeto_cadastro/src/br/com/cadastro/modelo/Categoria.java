package br.com.cadastro.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private Integer id;
	private String nome;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public Categoria(String nome) {
		this.nome = nome;
	}

	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Categoria: [ID: %d] - %s", this.id, this.nome);
	}

	public void adicionar(Pessoa pessoa) {

		pessoas.add(pessoa);

	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

}
