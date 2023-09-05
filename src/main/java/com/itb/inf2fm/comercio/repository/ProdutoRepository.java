package com.itb.inf2fm.comercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itb.inf2fm.comercio.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	
}
