package com.letscode.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letscode.produtos.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	Produto findById(long id);

}
