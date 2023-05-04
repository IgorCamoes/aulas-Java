package br.com.cadastro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cadastro.modelo.Categoria;
import br.com.cadastro.modelo.Pessoa;

public class PessoaDAO {

	static Connection conexao;

	public PessoaDAO(Connection conexao) throws SQLException {

		PessoaDAO.conexao = conexao;

	}

	public static void adicionar(Pessoa pessoa) throws SQLException {

		try (PreparedStatement stm = conexao.prepareStatement(
				"INSERT INTO tabelateste (NOME, IDADE, ESTADO) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {

			stm.setString(1, pessoa.getNome());
			stm.setInt(2, pessoa.getIdade());
			stm.setString(3, pessoa.getEstado());

			stm.execute();

			try (ResultSet rst = stm.getGeneratedKeys()) {

				while (rst.next()) {
					pessoa.setId(rst.getInt(1));
				}
			}

			System.out.println(pessoa);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Rollback iniciado");

			conexao.rollback();
		}

	}

	public List<Pessoa> listar() throws SQLException {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		String sql = "SELECT * FROM tabelateste";

		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			pstm.execute();

			try (ResultSet rst = pstm.getResultSet()) {

				while (rst.next()) {
					Pessoa pessoa = new Pessoa(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getString(4));

					pessoas.add(pessoa);
				}

			}

			return pessoas;

		}
	}

	public List<Pessoa> listar(String where) throws SQLException {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		try (PreparedStatement pstm = conexao.prepareStatement("SELECT * FROM tabelateste WHERE ?")) {

			pstm.setString(1, where);
			pstm.execute();

			try (ResultSet rst = pstm.getResultSet()) {
				while (rst.next()) {

					Pessoa pessoa = new Pessoa(rst.getInt("ID"), rst.getString("NOME"), rst.getInt("IDADE"),
							rst.getString("ESTADO"));

					pessoas.add(pessoa);

				}
			}

			return pessoas;

		}
	}

	public static void remover(String action, String indentifier) throws SQLException {

		try (PreparedStatement pstm = conexao.prepareStatement("Delete from tabelateste where ? = ?")) {

			if (action.toLowerCase() == "idade" || action.toLowerCase() == "id") {
				pstm.setString(1, action);
				pstm.setInt(2, Integer.parseInt(indentifier));
			} else {

				indentifier = String.format("'%s'", indentifier);

				pstm.setString(1, action);
				pstm.setString(2, indentifier);

			}

			pstm.execute();

			System.out.println(String.format("Você deletou %d linhas do banco de dados.", pstm.getUpdateCount()));

		}
	}

	public List<Pessoa> buscar(Categoria ct) throws SQLException {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		try (PreparedStatement pstm = conexao.prepareStatement("SELECT * FROM tabelateste WHERE CATEGORIA_ID = ?")) {

			pstm.setInt(1, ct.getId());
			pstm.execute();

			try (ResultSet rst = pstm.getResultSet()) {
				while (rst.next()) {

					Pessoa pessoa = new Pessoa(rst.getInt("ID"), rst.getString("NOME"), rst.getInt("IDADE"),
							rst.getString("ESTADO"));

					pessoas.add(pessoa);

				}
			}

			return pessoas;

		}
	}
}
