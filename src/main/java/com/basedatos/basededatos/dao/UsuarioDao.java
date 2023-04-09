package com.basedatos.basededatos.dao;
import com.basedatos.basededatos.models.UsuarioModel;
import java.util.List;

public interface UsuarioDao {

      List<UsuarioModel> getAll();
      UsuarioModel get(long id);
      UsuarioModel register(UsuarioModel usuarioModel);
      UsuarioModel update(UsuarioModel usuarioModel);
      void delete(  long id);

}
