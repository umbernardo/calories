/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.umbernardo.calories.config;


import br.com.umbernardo.calories.controller.HomeController;
import br.com.umbernardo.calories.dao.UsuarioDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author umbernardo
 */
@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class, UsuarioDAO.class})
public class AppWebConfiguration extends WebMvcConfigurerAdapter {
 
    @Bean 
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
    
    
}