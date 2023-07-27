package com.api.arquivo.dtos;

import java.util.Date;
import java.util.List;

public class UsuarioDto {

	private Integer idUsuario;
	private String nomeUsuario;
	private String login;
	private String senha;
	private String imagemUsuario;
	private Integer totalPaginas;
	private Integer totalLivros;
	private Date ultimoLivro;
	private List<LivroResumidoDto> listaLivros;

	public UsuarioDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioDto(Integer idUsuario, String nomeUsuario, String login, String senha, String imagemUsuario,
			Integer totalPaginas, Integer totalLivros, Date ultimoLivro, List<LivroResumidoDto> listaLivros) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.login = login;
		this.senha = senha;
		this.imagemUsuario = imagemUsuario;
		this.totalPaginas = totalPaginas;
		this.totalLivros = totalLivros;
		this.ultimoLivro = ultimoLivro;
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

	public String getImagemUsuario() {
		return imagemUsuario;
	}

	public void setImagemUsuario(String imagemUsuario) {
		this.imagemUsuario = imagemUsuario;
	}

	public Integer getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(Integer totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public Integer getTotalLivros() {
		return totalLivros;
	}

	public void setTotalLivros(Integer totalLivros) {
		this.totalLivros = totalLivros;
	}

	public Date getUltimoLivro() {
		return ultimoLivro;
	}

	public void setUltimoLivro(Date ultimoLivro) {
		this.ultimoLivro = ultimoLivro;
	}

	public List<LivroResumidoDto> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(List<LivroResumidoDto> listaLivros) {
		this.listaLivros = listaLivros;
	}

}
