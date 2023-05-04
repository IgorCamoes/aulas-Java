package br.com.alura.loja.testes;

import javax.persistence.EntityManager;

import br.com.alura.loja.dao.ProdutoDAO;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProdutos {

	public static void main(String[] args) {
		
		Categoria celulares = new Categoria("CELULARES");
		
		Produto produto = new Produto("Samsung Galaxy", "Celular de baixa performance mas bom custo para quem não usa muita coisa.", 999.00, celulares);
		
		
		EntityManager em = JPAUtil.getEntityManager();
		
		ProdutoDAO dao = new ProdutoDAO(em);
		
		em.getTransaction().begin();
		dao.cadastrar(produto);
		em.getTransaction().commit();
		em.close();
	}

}
