package com.quipux.service;

import com.quipux.model.Cancion;
import com.quipux.repository.CancionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CancionService {

    @Autowired
    private CancionRepository cancionRepository;

    public Cancion createCancion(Cancion cancion){
        return cancionRepository.save(cancion);
    }

    public List<Cancion> getAllCanciones(){
        Iterable<Cancion> canciones = cancionRepository.findAll();
        List<Cancion> cancionList = new ArrayList<Cancion>();
        canciones.forEach(cancionList::add);
        return  cancionList;
    }

    public Optional<Cancion> getCancionById(long id){
        return cancionRepository.findById(id);
    }

    public Cancion updateCancion(Cancion cancion){
        return cancionRepository.save(cancion);
    }
}
