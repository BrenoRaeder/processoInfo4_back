package com.api.arquivo.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.arquivo.dtos.LivroResumidoDto;
import com.api.arquivo.dtos.LoginDto;
import com.api.arquivo.dtos.UsuarioDto;
import com.api.arquivo.models.Livro;
import com.api.arquivo.models.Usuario;
import com.api.arquivo.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	private ModelMapper modelMapper;

	public List<UsuarioDto> getAllUsuario() {
		List<Usuario> listaUsuario = usuarioRepository.findAll();
		List<UsuarioDto> listaUsuarioDto = modelMapper.map(listaUsuario, new TypeToken<List<UsuarioDto>>() {
		}.getType());

		for (int i = 0; i < listaUsuario.size(); i++) {

			List<LivroResumidoDto> listaLivroDto = new ArrayList<>();
			for (Livro livro : listaUsuario.get(i).getListaLivros()) {

				LivroResumidoDto livroDto = modelMapper.map(livro, LivroResumidoDto.class);
				listaLivroDto.add(livroDto);
			}

			listaUsuarioDto.get(i).setListaLivros(listaLivroDto);
		}

		return listaUsuarioDto;
	}

	public UsuarioDto getUsuarioById(Integer id) {
		Usuario usuario = usuarioRepository.findById(id).orElse(null);

		if (usuario != null) {
			UsuarioDto usuarioDto = modelMapper.map(usuario, UsuarioDto.class);

			List<LivroResumidoDto> listaLivroDto = new ArrayList<>();
			for (Livro livro : usuario.getListaLivros()) {

				LivroResumidoDto livroDto = modelMapper.map(livro, LivroResumidoDto.class);
				listaLivroDto.add(livroDto);
			}

			usuarioDto.setListaLivros(listaLivroDto);
			
			return usuarioDto;
		}
		
		return null;
	}
	
	public UsuarioDto login(LoginDto login) {
		List<Usuario> listaUsuario = usuarioRepository.findAll();
		UsuarioDto usuario = new UsuarioDto();
		
		for(Usuario u : listaUsuario) {
			if(u.getLogin().equals(login.getLogin())) {
				usuario = modelMapper.map(u, UsuarioDto.class);
				
				List<LivroResumidoDto> listaLivroDto = new ArrayList<>();
				for (Livro livro : u.getListaLivros()) {

					LivroResumidoDto livroDto = modelMapper.map(livro, LivroResumidoDto.class);
					listaLivroDto.add(livroDto);
				}

				usuario.setListaLivros(listaLivroDto);
				
				return usuario;
			}	
		}
		
		return null;
		
	}
	
	public Usuario saveUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Boolean deleteUsuario(Integer id) {
		Usuario usuarioDeletar = usuarioRepository.findById(id).orElse(null);
		if (usuarioDeletar != null) {
			usuarioRepository.deleteById(id);
			usuarioDeletar = usuarioRepository.findById(id).orElse(null);
			if (usuarioDeletar != null) {
				return false;
			} 
			else {
				return true;
			}

		} 
		else {
			return false;
		}
	}
}
