/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uacm.curso.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author iarobles
 */
@Controller
public class InicioControlador {

    @RequestMapping(value = "/inicio")
    public String muestraInicio() {
        System.out.println("ejecutando metodo inicio");
        System.out.println("mostrando inicio (spring boot)");
        return "inicio"; //
    }

}
