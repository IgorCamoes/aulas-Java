package br.com.cadastro;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	private String url = "jdbc:mysql://localhost/testejava";
	private String usr = "root";
	private String psw = "";

	public DataSource dataSource;

	public ConnectionFactory() {

		ComboPooledDataSource comPoDaSo = new ComboPooledDataSource();
		comPoDaSo.setJdbcUrl(url);
		comPoDaSo.setUser(usr);
		comPoDaSo.setPassword(psw);

		comPoDaSo.setMaxPoolSize(25);

		this.dataSource = comPoDaSo;
	}

	public Connection recuperarConexao() throws SQLException {

		return this.dataSource.getConnection();
	}

}
