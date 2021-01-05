package br.com.orangeBank.dao;

import br.com.orangeBank.model.Usuario;

import java.util.List;

public interface UsuarioDAO {

    List<Usuario> get();

    Usuario get(int id);

    void save(Usuario usuario);
}
