package br.com.cadastro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();

		Connection con = conexao.recuperarConexao();

		Statement stm = con.createStatement();

		stm.execute("SELECT * FROM tabelateste");

		ResultSet rst = stm.getResultSet();

		while (rst.next()) {
			System.out.println("[" + rst.getInt("ID") + ", " + rst.getString("NOME") + ", " + rst.getInt("IDADE") + ", "
					+ rst.getString("ESTADO") + ", " + rst.getInt("categoria_id") + "]");
		}

		con.close();

	}

}
