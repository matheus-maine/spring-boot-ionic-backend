package com.matheusmaine.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.matheusmaine.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "Preenchimento obrigatorio")
	@Length(min = 5, max = 80, message = "o tamanho deve ser de 5 a 80 caracteres")
	private String nome;
	
	public CategoriaDTO() {
		
	}
	
	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
