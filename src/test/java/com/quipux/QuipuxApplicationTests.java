package com.quipux;

import com.quipux.model.Usuario;
import com.quipux.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class QuipuxApplicationTests {

	@Autowired
	UsuarioRepository usuarioRepository;
	@Test
	void crearUsuarioTest () {

		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNombre("usuario");
		usuario.setClave("123");
		Usuario usuarioObtenido =  usuarioRepository.save(usuario);
		assertTrue(usuario.getClave().equals(usuarioObtenido.getClave()));


	}

}
