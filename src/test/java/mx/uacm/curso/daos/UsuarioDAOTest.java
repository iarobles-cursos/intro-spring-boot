/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import mx.uacm.curso.entidades.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 *
 * @author iarobles
 */
@DataJpaTest
public class UsuarioDAOTest {
    
    @Autowired
    private UsuarioDAO usuarioDAO;
    
    @Test
    public void findByEmailTest(){
        
        Usuario usuario = usuarioDAO.findByEmail("juan@email.com");
        Assertions.assertNotNull(usuario);
        Assertions.assertEquals("juan@email.com",usuario.getEmail());
    }
    
}
