package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.FabricanteDao;
import com.basedatos.basededatos.models.FabricanteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@CrossOrigin
@Service
public class FabricanteService {
    @Autowired
    FabricanteDao fabricanteDao;

    public List<FabricanteModel> getAll(){
        return fabricanteDao.getAll();
    }

    public FabricanteModel get(long id){

        return fabricanteDao.get(id);
    }

    public FabricanteModel register(FabricanteModel fabricanteModel){
        return fabricanteDao.register(fabricanteModel);
    }

    public FabricanteModel update(@RequestBody FabricanteModel fabricanteModel){
        return fabricanteDao.update(fabricanteModel);
    }

    public void delete(@PathVariable long id){
        fabricanteDao.delete(id);
    }
}
