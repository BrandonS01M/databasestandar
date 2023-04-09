package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.UsuarioDao;
import com.basedatos.basededatos.models.UsuarioModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<UsuarioModel> getAll(){
        String hql = "FROM UserModel as u";
        return (List<UsuarioModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public UsuarioModel get(long id){
        return entityManager.find(UsuarioModel.class, id);

    }
    @Transactional
    @Override
    public UsuarioModel register(UsuarioModel usuarioModel){
        entityManager.merge(usuarioModel);
        return usuarioModel;
    }
    @Transactional
    @Override
    public UsuarioModel update(UsuarioModel usuarioModel){
        entityManager.merge(usuarioModel);
        return usuarioModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        UsuarioModel usuarioModel = get(id);
        entityManager.remove(usuarioModel);
    }
}
