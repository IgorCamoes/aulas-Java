package br.com.cadastro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperarConexao();

		Statement stm = con.createStatement();
		stm.execute("INSERT INTO tabelateste (nome, idade, estado) VALUES ('João Queiroz', '38', 'RS')",
				Statement.RETURN_GENERATED_KEYS);

		ResultSet rst = stm.getGeneratedKeys();

		while (rst.next()) {
			System.out.println("O item criado foi: [" + rst.getInt(1) + "]");
		}

	}

}
