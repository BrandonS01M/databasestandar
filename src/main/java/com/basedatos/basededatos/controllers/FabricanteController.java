package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.FabricanteModel;
import com.basedatos.basededatos.services.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/fabricante")
public class FabricanteController {
    @Autowired
    FabricanteService fabricanteService;

    @GetMapping("/getAll")
    List<FabricanteModel> getAll(){
        return fabricanteService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    FabricanteModel getById(@PathVariable("id") long id ){
        return fabricanteService.get(id);
    }

    @PostMapping(value = "/create")
    FabricanteModel create(@RequestBody FabricanteModel fabricanteModel){
        return fabricanteService.register(fabricanteModel);
    }

    @PutMapping(value = "/update/{id}")
    FabricanteModel updateById(@RequestBody FabricanteModel fabricanteModel){
        return fabricanteService.update(fabricanteModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteById(@PathVariable("id") long id){
        fabricanteService.delete(id);
    }
}
