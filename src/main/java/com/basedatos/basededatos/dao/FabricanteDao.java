package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.FabricanteModel;

import java.util.List;

public interface FabricanteDao {

    List<FabricanteModel> getAll();
    FabricanteModel get(long id);
    FabricanteModel register(FabricanteModel fabricanteModel);
    FabricanteModel update(FabricanteModel fabricanteModel);
    void delete(  long id);
}
