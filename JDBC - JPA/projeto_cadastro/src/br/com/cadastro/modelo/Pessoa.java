package br.com.cadastro.modelo;

import java.sql.SQLException;

import br.com.cadastro.dao.PessoaDAO;

public class Pessoa {

	private Integer id;
	private String nome;
	private Integer idade;
	private String estado;

	public Pessoa(String nome, Integer idade, String estado) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.estado = estado;
	}

	public Pessoa(Integer id, String nome, Integer idade, String estado) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.estado = estado;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("A pessoa cadastrada foi: [ID: %d] - %s, %d anos - %s", this.id, this.nome, this.idade,
				this.estado);
	}

	public void adicionarPessoa(Pessoa pessoa) throws SQLException {

		PessoaDAO.adicionar(pessoa);

	}

}
