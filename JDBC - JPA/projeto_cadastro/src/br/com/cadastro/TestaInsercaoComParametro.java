package br.com.cadastro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();

		try (Connection con = conexao.recuperarConexao()) {

			con.setAutoCommit(false);

			try (PreparedStatement stm = con.prepareStatement(
					"INSERT INTO tabelateste (nome, idade, estado) VALUES (?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS)) {

				adicionarPessoa("Janete Cardoso", 31, "SP", stm);
				adicionarPessoa("Ricardo Borges", 42, "RJ", stm);

				con.commit();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Rollback iniciado");

				con.rollback();

			}
		}
	}

	// ctrl+3 extract method

	private static void adicionarPessoa(String nome, Integer idade, String estado, PreparedStatement stm)
			throws SQLException {
		stm.setString(1, nome);
		stm.setInt(2, idade);
		stm.setString(3, estado);

		if (estado.equals("RJ")) {
			throw new RuntimeException("Não foi possível adicionar a pessoa");
		}

		stm.execute();

		try (ResultSet rst = stm.getGeneratedKeys()) {

			while (rst.next()) {
				System.out.println("O item criado foi: [" + rst.getInt(1) + "]");
			}
		}
	}

}
