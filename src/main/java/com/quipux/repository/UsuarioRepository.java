package com.quipux.repository;

import com.quipux.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {

    Usuario findByNombre(String nombre);
}
