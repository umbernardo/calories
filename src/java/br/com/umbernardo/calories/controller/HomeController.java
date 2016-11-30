/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.umbernardo.calories.controller;

import br.com.umbernardo.calories.dao.UsuarioDAO;
import br.com.umbernardo.calories.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author umbernardo
 */
@Controller
public class HomeController {
    
    @Autowired
    private UsuarioDAO usuarioDAO;
    
    @RequestMapping("/")
    public String home(){
        return "home";
    }
   

}
