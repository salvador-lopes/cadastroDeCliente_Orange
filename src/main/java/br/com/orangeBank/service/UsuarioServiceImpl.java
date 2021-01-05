package br.com.orangeBank.service;

import br.com.orangeBank.dao.UsuarioDAO;
import br.com.orangeBank.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public List<Usuario> get() {
        return usuarioDAO.get();
    }

    @Transactional
    @Override
    public Usuario get(int id) {
        return usuarioDAO.get(id);
    }
    @Transactional
    @Override
    public void save(Usuario usuario) {
        usuarioDAO.save(usuario);
    }
}
