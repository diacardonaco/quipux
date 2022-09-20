package com.quipux;

import com.quipux.model.Usuario;
import com.quipux.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class QuipuxApplicationTests {

	@Autowired
	private UsuarioRepository usuarioRepository;
	@Test
	void crearUsuarioTest () {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNombre("Pablo");
		usuario.setClave("123");

		Usuario usuarioObtenido =  usuarioRepository.save(usuario);

		assertTrue(usuario.getClave().equals(usuarioObtenido.getClave()));


	}

}
