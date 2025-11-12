package com.lucas.cadastro_usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lucas.cadastro_usuarios.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
