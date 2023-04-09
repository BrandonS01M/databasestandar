package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.ProductoDao;
import com.basedatos.basededatos.models.ProductoModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class ProductoDaoImp implements ProductoDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<ProductoModel> getAll(){
        String hql = "FROM UserModel as u";
        return (List<ProductoModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public ProductoModel get(long id){
        return entityManager.find(ProductoModel.class, id);

    }
    @Transactional
    @Override
    public ProductoModel register(ProductoModel productoModel){
        entityManager.merge(productoModel);
        return productoModel;
    }
    @Transactional
    @Override
    public ProductoModel update(ProductoModel productoModel){
        entityManager.merge(productoModel);
        return productoModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        ProductoModel productoModel = get(id);
        entityManager.remove(productoModel);
    }
}
