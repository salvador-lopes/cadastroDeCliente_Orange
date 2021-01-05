package br.com.orangeBank.service;

import br.com.orangeBank.model.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> get();

    Usuario get(int id);

    void save(Usuario usuario);
}
