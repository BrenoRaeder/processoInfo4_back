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

import com.api.arquivo.dtos.LoginDto;
import com.api.arquivo.dtos.UsuarioDto;
import com.api.arquivo.models.Usuario;
import com.api.arquivo.services.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDto>> getAllusuario() {
		return new ResponseEntity<>(usuarioService.getAllUsuario(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UsuarioDto> getusuarioById(@PathVariable Integer id) {
		
		UsuarioDto usuarioResponse = usuarioService.getUsuarioById(id);
		
		if(usuarioResponse == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(usuarioResponse, HttpStatus.OK);
		}
	}
	
	@PostMapping
	public ResponseEntity<Usuario> saveusuario(@RequestBody Usuario usuario) {
		return new ResponseEntity<>(usuarioService.saveUsuario(usuario), HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteusuario(@PathVariable Integer id) {
		Boolean resp = usuarioService.deleteUsuario(id);
		if(resp)
			return new ResponseEntity<>(resp, HttpStatus.OK);
		else
			return new ResponseEntity<>(resp, HttpStatus.NOT_MODIFIED);
	}
}
