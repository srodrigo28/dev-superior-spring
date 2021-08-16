package com.devsuperior.hrworker.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pokemon")
public class Pokemon implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String tipo;
	private int nivel;
	
	public Pokemon() {}

	public Pokemon(Long id, String nome, String tipo, int nivel) {
		super();
		this.id    = id;
		this.nome  = nome;
		this.tipo  = tipo;
		this.nivel = nivel;
	}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id;	}
	
	public String getNome() { return nome;	}
	public void setNome(String nome) { this.nome = nome; }

	public String getTipo() { return tipo;	}
	public void setTipo(String tipo) { this.tipo = tipo; }

	public int getNivel() {	return nivel; }
	public void setNivel(int nivel) { this.nivel = nivel; }
	
	
	

	
}
