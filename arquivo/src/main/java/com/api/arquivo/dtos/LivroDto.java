package com.api.arquivo.dtos;

import java.util.Date;

public class LivroDto {

	private Integer idLivro;
	private String nomeLivro;
	private String imgCapa;
	private Integer qtdPaginas;
	private Date dataComeco;
	private Date dataTermino;
	private UsuarioResumidoDto usuario;

	public LivroDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LivroDto(Integer idLivro, String nomeLivro, String imgCapa, Integer qtdPaginas, Date dataComeco,
			Date dataTermino, UsuarioResumidoDto usuario) {
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

	public UsuarioResumidoDto getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioResumidoDto usuario) {
		this.usuario = usuario;
	}

}
