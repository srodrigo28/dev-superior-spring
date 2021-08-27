package com.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.repository.CarroRepository;
import com.app.entity.Carro;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarroController {
	
	CarroRepository repository;
	
	@GetMapping("/carro")
	public List<Carro> getAllCarros(){
		return repository.findAll();
	}
	/**
	@SuppressWarnings("deprecation")
	@GetMapping("/carro/{id}")
	public Carro getCarroById(@PathVariable Long id) {
		return repository.getOne(id);
	}
	*/
	
	@PostMapping("/carro")
	public Carro saveCarro(@RequestBody Carro carro) {
		return repository.save(carro);
	}
	
	@DeleteMapping("/carro/{id}")
	public void deleteCarro(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
