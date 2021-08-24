package br.com.alura.forum.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.forum.modelo.Topico;

public class TopicoDTO {
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoDTO(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<TopicoDTO> converter(List<Topico> topicos) {
	    List<TopicoDTO> dtos = new ArrayList<>();
	    topicos.stream().forEach(topico -> {
	    	TopicoDTO dto = new TopicoDTO(topico);
	        dtos.add(dto);
	    });

	    return dtos;
	}
	/**  https://cursos.alura.com.br/course/spring-boot-api-rest/task/55818
	public static List<TopicoDTO> converter1(List<Topico> topicos) {
	    return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
	}
	*/
}
