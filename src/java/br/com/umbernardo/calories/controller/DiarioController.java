/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.umbernardo.calories.controller;

import br.com.umbernardo.calories.dao.DiarioDAO;
import br.com.umbernardo.calories.model.Diario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ricar
 */
@Controller
public class DiarioController {
    
    @Autowired
    private DiarioDAO diarioDAO;
    
   @RequestMapping(value="/diario", method=RequestMethod.POST)
    public ModelAndView listar() {
    ModelAndView mv = new ModelAndView("diario/sucesso");
    List<Diario> diario = diarioDAO.listar();
    mv.addObject("diario",diario);
    return mv;
    }
    
//     @RequestMapping(value="/diario", method=RequestMethod.POST)
//    public String add(Diario diario) {
//        System.out.println(diario.toString());
//        diarioDAO.addDiario(diario);
//        
//        return "diario/sucesso"; // list() para voltar para lista 
//        //new ModelAndView("redirect:pessoas")
//        // RedirectAtributtes addFlashAttribute("sucesso","sucesso")
//    }
    
    @RequestMapping("/diario/addForm")
    public String addForm() {
        return "/diario/addForm";
    }
}
