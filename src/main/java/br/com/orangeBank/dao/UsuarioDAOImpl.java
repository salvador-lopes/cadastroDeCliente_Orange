package br.com.orangeBank.dao;

import br.com.orangeBank.model.Usuario;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Usuario> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Usuario> query = currentSession.createQuery("from Usuario", Usuario.class);
        List<Usuario> list = query.getResultList();
        return list;
    }

    @Override
    public Usuario get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Usuario usuarioObj = currentSession.get(Usuario.class, id);
        return usuarioObj;
    }

    @Override
    public void save(Usuario usuario) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(usuario);
    }
}
