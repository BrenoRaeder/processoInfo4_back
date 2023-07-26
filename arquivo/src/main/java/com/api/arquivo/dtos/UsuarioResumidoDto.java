package com.api.arquivo.dtos;

public class UsuarioResumidoDto {

	private Integer idUsuario;
	private String nomeUsuario;
	private String login;

	public UsuarioResumidoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioResumidoDto(Integer idUsuario, String nomeUsuario, String login) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.login = login;
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

}
