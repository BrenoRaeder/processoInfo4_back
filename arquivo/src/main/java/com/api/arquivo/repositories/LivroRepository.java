package com.api.arquivo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.arquivo.models.Livro;

public interface LivroRepository extends JpaRepository<Livro,Integer>{

}
