package com.api.arquivo.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.arquivo.dtos.LivroDto;
import com.api.arquivo.dtos.UsuarioResumidoDto;
import com.api.arquivo.models.Livro;
import com.api.arquivo.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	LivroRepository livroRepository;

	@Autowired
	private ModelMapper modelMapper;

	public List<LivroDto> getAllLivro() {
		List<Livro> listaLivro = livroRepository.findAll();
		List<LivroDto> listaLivroDto = modelMapper.map(listaLivro, new TypeToken<List<LivroDto>>() {
		}.getType());

		for (int i = 0; i < listaLivro.size(); i++) {

			UsuarioResumidoDto usuarioDto = modelMapper.map(listaLivro.get(i).getUsuario(), UsuarioResumidoDto.class);
			listaLivroDto.get(i).setUsuario(usuarioDto);
		}
		
		return listaLivroDto;
	}
	
	public LivroDto getLivroById(Integer id) {
		Livro livro = livroRepository.findById(id).orElse(null);
		
		if(livro != null) {
			LivroDto livroDto = modelMapper.map(livro, LivroDto.class);
			UsuarioResumidoDto usuarioDto = modelMapper.map(livro.getUsuario(), UsuarioResumidoDto.class);
			livroDto.setUsuario(usuarioDto);
			
			return livroDto;
		}
		
		return null;
	}
	
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public Boolean deleteLivro(Integer id) {
		Livro livroDeletar = livroRepository.findById(id).orElse(null);
		if (livroDeletar != null) {
			livroRepository.deleteById(id);
			livroDeletar = livroRepository.findById(id).orElse(null);
			if (livroDeletar != null) {
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
