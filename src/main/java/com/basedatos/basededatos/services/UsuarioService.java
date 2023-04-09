package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.UsuarioDao;
import com.basedatos.basededatos.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class UsuarioService {

    @Autowired
    UsuarioDao usuarioDao;

    public List<UsuarioModel> getAll(){
        return usuarioDao.getAll();
    }

    public UsuarioModel get(long id){

        return usuarioDao.get(id);
    }

    public UsuarioModel register(UsuarioModel usuarioModel){
        return usuarioDao.register(usuarioModel);
    }

    public UsuarioModel update(@RequestBody UsuarioModel usuarioModel){
          return usuarioDao.update(usuarioModel);
    }

    public void delete(@PathVariable long id){
          usuarioDao.delete(id);
    }

}
