package com.lucas.cadastro_usuarios.service;

import com.lucas.cadastro_usuarios.entity.Usuario;
import com.lucas.cadastro_usuarios.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import com.lucas.cadastro_usuarios.exception.ResourceNotFoundException;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Usuário com ID " + id + " não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
