/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.umbernardo.calories.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ricar
 */
@Entity
public class Diario {
   
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;
    
    private String nome;
    private Integer quantidade;
    private Integer calorias;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Integer getCalorias() {
        return calorias;
    }
}
