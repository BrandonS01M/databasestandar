package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.FabricanteDao;
import com.basedatos.basededatos.models.FabricanteModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class FabricanteDaoImp implements FabricanteDao {


    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<FabricanteModel> getAll(){
        String hql = "FROM UserModel as u";
        return (List<FabricanteModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public FabricanteModel get(long id){
        return entityManager.find(FabricanteModel.class, id);

    }
    @Transactional
    @Override
    public FabricanteModel register(FabricanteModel fabricanteModel){
        entityManager.merge(fabricanteModel);
        return fabricanteModel;
    }
    @Transactional
    @Override
    public FabricanteModel update(FabricanteModel fabricanteModel){
        entityManager.merge(fabricanteModel);
        return fabricanteModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        FabricanteModel fabricanteModel = get(id);
        entityManager.remove(fabricanteModel);
    }
}
