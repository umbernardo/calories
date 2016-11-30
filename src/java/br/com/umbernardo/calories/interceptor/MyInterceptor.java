/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.umbernardo.calories.interceptor;

import br.com.umbernardo.calories.model.Usuario;
import org.springframework.web.portlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        String uri = request.getRequestURI();
        if (uri.endsWith("home") || uri.endsWith("login")) {
            return true;
        }
        if (request.getSession().getAttribute("usuariologado") != null) {
            return true;
        }

        response.sendRedirect("home");

        return false;
    }
}
