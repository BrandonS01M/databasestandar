package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.ProductoModel;
import com.basedatos.basededatos.services.ProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoServices productoServices;

    @GetMapping("/getAllP")
    List<ProductoModel> getAll(){
        return productoServices.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    ProductoModel getById(@PathVariable("id") long id ){
        return productoServices.get(id);
    }

    @PostMapping(value = "/create")
    ProductoModel create(@RequestBody ProductoModel productoModel){
        return productoServices.register(productoModel);
    }

    @PutMapping(value = "/update/{id}")
    ProductoModel updateById(@RequestBody ProductoModel productoModel){
        return productoServices.update(productoModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteById(@PathVariable("id") long id){
        productoServices.delete(id);
    }
}
