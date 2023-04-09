package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.ProductoDao;
import com.basedatos.basededatos.models.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@CrossOrigin
@Service
public class ProductoServices {
    @Autowired
    ProductoDao productoDao;

    public List<ProductoModel> getAll(){
        return productoDao.getAll();
    }

    public ProductoModel get(long id){

        return productoDao.get(id);
    }

    public ProductoModel register(ProductoModel productoModel){
        return productoDao.register(productoModel);
    }

    public ProductoModel update(@RequestBody ProductoModel productoModel){
        return productoDao.update(productoModel);
    }

    public void delete(@PathVariable long id){
        productoDao.delete(id);
    }
}
