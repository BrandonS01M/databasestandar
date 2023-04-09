package com.basedatos.basededatos.dao;
import com.basedatos.basededatos.models.ProductoModel;
import java.util.List;

public interface ProductoDao {
    List<ProductoModel> getAll();
    ProductoModel get(long id);
    ProductoModel register(ProductoModel productoModel);
    ProductoModel update(ProductoModel productoModel);
    void delete(  long id);
}
