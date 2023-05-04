package br.com.cadastro;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.cadastro.dao.CategoriaDAO;
import br.com.cadastro.modelo.Categoria;
import br.com.cadastro.modelo.Pessoa;

public class TestaListagemDeCategoria {

	public static void main(String[] args) throws SQLException {

		try (Connection conexao = new ConnectionFactory().recuperarConexao()) {

			CategoriaDAO categoriaDao = new CategoriaDAO(conexao);

			List<Categoria> listaDeCategorias = categoriaDao.listarComPessoas();

			listaDeCategorias.stream().forEach(ct -> {
				System.out.println(" -> " + ct.getNome().substring(0, 1).toUpperCase() + ct.getNome().substring(1));
				System.out.println(" ---------------");

				for (Pessoa pessoa : ct.getPessoas()) {
					System.out.println("| " + pessoa.getNome());
				}

				System.out.println(" ---------------");
				System.out.println();
			});

		}

	}

}
