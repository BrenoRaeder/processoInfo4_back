package com.api.arquivo.dtos;

public class LoginDto {

	private String login;
	private String senha;

	public LoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginDto(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
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

}
