package com.market.dao;

import com.market.Produto;

public interface ProdutoDAO {
	void adicionar(Produto p);
	void atualizar(long id, Produto p);
	void remover(long id);
	
}
