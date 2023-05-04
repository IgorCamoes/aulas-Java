package br.com.cadastro;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperarConexao();

		Statement stm = con.createStatement();

		stm.execute("DELETE FROM tabelateste WHERE ID = 12");

		System.out.println("Linhas modificadas: " + stm.getUpdateCount());

	}

}
