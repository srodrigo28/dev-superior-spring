package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
