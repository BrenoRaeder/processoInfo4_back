package com.api.arquivo.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idUsuario", scope = Usuario.class)

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer idUsuario;

	@Column(name = "nome_usuario")
	private String nomeUsuario;

	@Column(name = "login")
	private String login;

	@Column(name = "senha")
	private String senha;

	@Column(name = "imagem_usuario")
	private String imagemUsuario;

	@OneToMany(mappedBy = "usuario")
	private List<Livro> listaLivros;

	public Usuario() {
		super();
	}

	public Usuario(Integer idUsuario, String nomeUsuario, String login, String senha, String imagemUsusario,
			List<Livro> listaLivros) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.login = login;
		this.senha = senha;
		this.imagemUsuario = imagemUsusario;
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

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}

}
