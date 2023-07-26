package com.api.arquivo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.arquivo.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
