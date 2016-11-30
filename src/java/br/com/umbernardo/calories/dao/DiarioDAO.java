/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.umbernardo.calories.dao;

import br.com.umbernardo.calories.model.Diario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ricar
 */
@Repository 
@Transactional
public class DiarioDAO {
    
    @PersistenceContext
    private EntityManager em;
    
     public void addDiario(Diario diario) { 
        em.persist(diario);
    }
    
    public List<Diario> listar() {
    return em.createQuery("Select p from Diario p", Diario.class).getResultList();
    } 
}
