package com.api.arquivo.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idLivro", scope = Livro.class)

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_livro")
	private Integer idLivro;

	@Column(name = "nome_livro")
	private String nomeLivro;

	@Column(name = "imagem_capa")
	private String imgCapa;

	@Column(name = "quantidade_paginas")
	private Integer qtdPaginas;

	@Column(name = "data_comeco")
	private Date dataComeco;

	@Column(name = "imagem_termino")
	private Date dataTermino;

	@ManyToOne
	@JoinColumn(name = "id_usuario_fk", referencedColumnName = "id_usuario")
	private Usuario usuario;

	public Livro() {
		super();
	}

	public Livro(Integer idLivro, String nomeLivro, String imgCapa, Integer qtdPaginas, Date dataComeco,
			Date dataTermino, Usuario usuario) {
		super();
		this.idLivro = idLivro;
		this.nomeLivro = nomeLivro;
		this.imgCapa = imgCapa;
		this.qtdPaginas = qtdPaginas;
		this.dataComeco = dataComeco;
		this.dataTermino = dataTermino;
		this.usuario = usuario;
	}

	public Integer getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Integer idLivro) {
		this.idLivro = idLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getImgCapa() {
		return imgCapa;
	}

	public void setImgCapa(String imgCapa) {
		this.imgCapa = imgCapa;
	}

	public Integer getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(Integer qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public Date getDataComeco() {
		return dataComeco;
	}

	public void setDataComeco(Date dataComeco) {
		this.dataComeco = dataComeco;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
