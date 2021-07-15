package com.devsuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrworker.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
