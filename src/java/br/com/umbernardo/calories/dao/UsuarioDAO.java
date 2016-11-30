/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.umbernardo.calories.dao;

import br.com.umbernardo.calories.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author umbernardo
 */
@Repository 
@Transactional
public class UsuarioDAO {
    //private Connection connection;
    
    @PersistenceContext
    private EntityManager em;
    
    public void addUser(Usuario usuario) { 
        em.persist(usuario);
    }

    
//    public boolean existeUsuario(Usuario usuario) {
//		
//		if(usuario == null) {
//			throw new IllegalArgumentException("Usuário não deve ser nulo");
//		}
//		
//		try {
//			PreparedStatement stmt = this.connection.prepareStatement("select * from usuarios where login = ? and senha = ?");
//			stmt.setString(1, usuario.getEmail());
//			stmt.setString(2, usuario.getPass());
//			ResultSet rs = stmt.executeQuery();
//
//			boolean encontrado = rs.next();
//			rs.close();
//			stmt.close();
//
//			return encontrado;
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}
}
