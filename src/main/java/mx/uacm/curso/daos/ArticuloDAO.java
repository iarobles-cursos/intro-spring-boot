/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import mx.uacm.curso.entidades.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author iarobles
 */
public interface ArticuloDAO extends JpaRepository<Articulo, Integer>{
    
}