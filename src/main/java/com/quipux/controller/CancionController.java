package com.quipux.controller;

import com.quipux.model.Cancion;
import com.quipux.model.Client;
import com.quipux.service.CancionService;
import com.quipux.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cancion")
public class CancionController {


    @Autowired
    private CancionService cancionService;

    @RequestMapping(value = "/canciones", method = RequestMethod.GET)
    public ResponseEntity<Cancion> getAllCanciones(){
        List<Cancion> canciones = cancionService.getAllCanciones();
        return new ResponseEntity(canciones, HttpStatus.OK);
    }

    @RequestMapping(value = "/create-cancion", method = RequestMethod.POST)
    public ResponseEntity<Cancion> createProduct(@RequestBody Cancion cancion){
        Cancion cancionCreated = cancionService.createCancion(cancion);
        return new ResponseEntity(cancionCreated, HttpStatus.CREATED);
    }

}
