/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.daos;

import java.util.Date;
import java.util.List;
import javax.persistence.Tuple;
import mx.uacm.curso.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author iarobles
 */
public interface UsuarioDAO extends JpaRepository<Usuario,Integer>{
    
    public Usuario findByEmail(String email);
    
    @Query("SELECT u.id AS id, COUNT(a.id) AS total FROM Usuario u LEFT JOIN u.articulos a WHERE a.fechaCreacion>=:fechaMin OR u.articulos IS EMPTY GROUP BY u.id")
    public List<Tuple> obtenIdUsuarioYTotalArticulosPorFecha(@Param("fechaMin") Date fechaMin);
    
}
