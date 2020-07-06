package com.matheusmaine.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusmaine.cursomc.domain.Categoria;
import com.matheusmaine.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository; // injeção de dependencia
	
	//usando Spring boot 2.xxx
	public Categoria buscarCategoria(Integer id) {
		Optional<Categoria> cat = categoriaRepository.findById(id);
		return cat.orElse(null);
				
	}

}
