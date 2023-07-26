package com.api.arquivo.dtos;

import java.util.List;

public class UsuarioDto {

	private Integer idUsuario;
	private String nomeUsuario;
	private String login;
	private String senha;
	private List<LivroResumidoDto> listaLivros;

	public UsuarioDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioDto(Integer idUsuario, String nomeUsuario, String login, String senha,
			List<LivroResumidoDto> listaLivros) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.login = login;
		this.senha = senha;
		this.listaLivros = listaLivros;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<LivroResumidoDto> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(List<LivroResumidoDto> listaLivros) {
		this.listaLivros = listaLivros;
	}

}
