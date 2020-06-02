/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.controladores;

import java.util.List;
import mx.uacm.curso.daos.ArticuloDAO;
import mx.uacm.curso.entidades.Articulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author iarobles
 */
@Controller
public class InicioControlador {
    
    @Autowired
    private ArticuloDAO articuloDAO;

    @RequestMapping(value = "/inicio")
    public String muestraInicio(Model modelo) {
        System.out.println("ejecutando metodo inicio");
        System.out.println("mostrando inicio (spring boot)");
        
        List<Articulo> articulos = articuloDAO.findAll();
        modelo.addAttribute("articulos",articulos);
        
        return "inicio"; //
    }

}
