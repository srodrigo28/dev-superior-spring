package com.devsuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrworker.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
