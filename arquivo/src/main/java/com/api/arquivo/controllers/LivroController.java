package com.api.arquivo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.arquivo.dtos.LivroDto;
import com.api.arquivo.models.Livro;
import com.api.arquivo.services.LivroService;


@CrossOrigin
@RestController
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	LivroService livroService;
	
	@GetMapping
	public ResponseEntity<List<LivroDto>> getAllLivro() {
		return new ResponseEntity<>(livroService.getAllLivro(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<LivroDto> getLivroById(@PathVariable Integer id) {
		
		LivroDto livroResponse = livroService.getLivroById(id);
		
		if(livroResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(livroResponse, HttpStatus.OK);
		}
	}
	
	@PostMapping
	public ResponseEntity<Livro> saveLivro(@RequestBody Livro livro) {
		return new ResponseEntity<>(livroService.saveLivro(livro), HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteLivro(@PathVariable Integer id) {
		Boolean resp = livroService.deleteLivro(id);
		if(resp)
			return new ResponseEntity<>(resp, HttpStatus.OK);
		else
			return new ResponseEntity<>(resp, HttpStatus.NOT_MODIFIED);
	}
}
