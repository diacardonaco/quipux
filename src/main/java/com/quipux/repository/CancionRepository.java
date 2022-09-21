package com.quipux.repository;

import com.quipux.model.Cancion;
import org.springframework.data.repository.CrudRepository;

public interface CancionRepository extends CrudRepository<Cancion,Long> {
}
