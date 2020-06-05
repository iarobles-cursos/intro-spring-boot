/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import mx.uacm.curso.entidades.Articulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 *
 * @author iarobles
 */
@DataJpaTest
public class ArticuloDAOTest {
    
    @Autowired
    private ArticuloDAO articuloDAO;
    
    @Test
    public void findAllTest(){
        List<Articulo> articulos = articuloDAO.findAll();
        Assertions.assertEquals(3, articulos.size());        
    }
    
    @Test
    public void findByFechaCreacionGreaterThanEqualTest(){        
        
        GregorianCalendar calendar = new GregorianCalendar(2013,0,1);
        Date fechaMinima = calendar.getTime();
        List<Articulo> articulos = articuloDAO.findByFechaCreacionGreaterThanEqual(fechaMinima);
        Assertions.assertEquals(2,articulos.size());
        
    }
    
    
}