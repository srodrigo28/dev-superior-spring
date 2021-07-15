package com.devsuperior.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.hrworker.entities.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}
