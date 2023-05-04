package br.com.cadastro;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory conexao = new ConnectionFactory();

		Connection con = conexao.recuperarConexao();

		System.out.println("Fechando Conexão!");

		con.close();
	}

}
