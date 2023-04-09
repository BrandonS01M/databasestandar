package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.UsuarioModel;
import com.basedatos.basededatos.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/getAll")
    List<UsuarioModel> getAllUser(){
        return usuarioService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    UsuarioModel getUserById(@PathVariable("id") long id ){
        return usuarioService.get(id);
    }

    @PostMapping(value = "/create")
    UsuarioModel createUser(@RequestBody UsuarioModel usuarioModel){
     return usuarioService.register(usuarioModel);
    }



    @PutMapping(value = "/update/{id}")
    UsuarioModel updateUserById(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.update(usuarioModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteUserById(@PathVariable("id") long id){
        usuarioService.delete(id);
    }
}
