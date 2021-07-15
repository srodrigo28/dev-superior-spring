package com.devsuperior.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.entities.Jogos;
import com.devsuperior.hrworker.repositories.JogosRepository;

@RestController
@RequestMapping(value = "/jogos")
public class JogosResource {
	
	@Autowired
	private JogosRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Jogos>> findAll(){
		List<Jogos> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Jogos> findById(@PathVariable Long id){
		Jogos obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}
