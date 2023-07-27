package com.api.arquivo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.arquivo.dtos.LoginDto;
import com.api.arquivo.dtos.UsuarioDto;
import com.api.arquivo.services.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	UsuarioService usuarioService;

	@PostMapping
	public ResponseEntity<UsuarioDto> login(@RequestBody LoginDto login) {

		UsuarioDto usuarioLogin = usuarioService.login(login);

		if (usuarioLogin == null) {
			return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
		} else {
			return new ResponseEntity<>(usuarioLogin, HttpStatus.OK);
		}
	}
}
