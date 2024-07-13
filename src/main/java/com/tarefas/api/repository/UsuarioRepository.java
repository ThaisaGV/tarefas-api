package com.tarefas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarefas.api.model.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {




}
    


