/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.umbernardo.calories.controller;

import br.com.umbernardo.calories.dao.UsuarioDAO;
import br.com.umbernardo.calories.model.Usuario;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Aluno
 */
@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioDAO usuarioDAO;
    
    @RequestMapping("/usuarios/cadastrarUsuario")
    public String cadastrarUsuario() {
        return "/usuarios/cadastrarUsuario";
    }
    
     @RequestMapping(value="/usuarios", method=RequestMethod.POST)
    public String add(Usuario usuario) {
        System.out.println(usuario.toString());
        usuarioDAO.addUser(usuario);
        return "usuarios/sucesso"; // list() para voltar para lista 
        //new ModelAndView("redirect:pessoas")
        // RedirectAtributtes addFlashAttribute("sucesso","sucesso")
    }

    
    @RequestMapping("/usuarios/dashboard")
    public String dashboard() {
        return "/usuarios/dashboard";
    }
    
//    @RequestMapping("/efetuaLogin")
//    public String efetuaLogin(Usuario usuario, HttpSession session) {
//      if(new UsuarioDAO().existeUsuario(usuario)) {
//        session.setAttribute("usuarioLogado", usuario);
//        return "/usuarios/dashboard";
//      }
//      return "redirect:home";
//}
    
}
