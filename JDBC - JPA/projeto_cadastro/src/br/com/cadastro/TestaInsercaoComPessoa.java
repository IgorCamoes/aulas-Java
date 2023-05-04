package br.com.cadastro;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.cadastro.dao.PessoaDAO;
import br.com.cadastro.modelo.Pessoa;

@SuppressWarnings("unused")
public class TestaInsercaoComPessoa {

	public static void main(String[] args) throws SQLException {

		Pessoa pessoa = new Pessoa("Carlos Andrade", 46, "SP");

		try (Connection conexao = new ConnectionFactory().recuperarConexao()) {
			PessoaDAO pessoaDao = new PessoaDAO(conexao);

//			pessoaDao.remover("idade", "25");

			List<Pessoa> listaDePessoas = pessoaDao.listar();

			listaDePessoas.stream().forEach(lp -> System.out.println(lp));
		}

	}

}
