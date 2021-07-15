package com.devsuperior.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.entities.Pokemon;
import com.devsuperior.hrworker.repositories.PokemonRepository;

@RestController
@RequestMapping(value = "/pokemon")
public class PokemonResource {
	
	@Autowired
	private PokemonRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Pokemon>> findAll(){
		List<Pokemon> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pokemon> findById(@PathVariable Long id){
		Pokemon obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}
