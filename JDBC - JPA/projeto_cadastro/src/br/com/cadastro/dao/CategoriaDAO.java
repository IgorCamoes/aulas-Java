package br.com.cadastro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastro.ConnectionFactory;
import br.com.cadastro.modelo.Categoria;
import br.com.cadastro.modelo.Pessoa;

public class CategoriaDAO {

	static Connection conexao;

	public CategoriaDAO(Connection conexao) {

	}

	public List<Categoria> listar() throws SQLException {

		conexao = new ConnectionFactory().recuperarConexao();

		conexao.setAutoCommit(false);

		List<Categoria> categorias = new ArrayList<Categoria>();

		try (PreparedStatement pstm = conexao.prepareStatement("SELECT * FROM categoria")) {

			pstm.execute();

			try (ResultSet rst = pstm.getResultSet()) {

				while (rst.next()) {
					Categoria categoria = new Categoria(rst.getInt("ID"), rst.getString("NOME"));

					categorias.add(categoria);
				}

			}

			return categorias;

		}
	}

	public List<Categoria> listarComPessoas() throws SQLException {

		Categoria ultima = null;

		conexao = new ConnectionFactory().recuperarConexao();

		conexao.setAutoCommit(false);

		List<Categoria> categorias = new ArrayList<Categoria>();

		try (PreparedStatement pstm = conexao
				.prepareStatement("SELECT * FROM categoria c INNER JOIN tabelateste P ON C.ID = P.CATEGORIA_ID")) {

			pstm.execute();

			try (ResultSet rst = pstm.getResultSet()) {

				while (rst.next()) {

					if (ultima == null || !ultima.getNome().equals(rst.getString("NOME"))) {

						Categoria categoria = new Categoria(rst.getInt("ID"), rst.getString("NOME"));

						ultima = categoria;

						categorias.add(categoria);

					}

					Pessoa pessoa = new Pessoa(rst.getInt(3), rst.getString(4), rst.getInt(5), rst.getString(6));

					ultima.adicionar(pessoa);

				}

			}

			return categorias;

		}
	}
}
