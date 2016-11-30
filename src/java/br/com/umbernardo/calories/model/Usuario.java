/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.umbernardo.calories.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author umbernardo
 */
@Entity
public class Usuario {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;
    
    private String nome;
    private String email;
    private Integer altura;
    private Integer peso;
    private String sexo;
    private String login;
    private String pass;

    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAltura() {
        return altura;
    }
    public String getLogin() {
        return login;
    }

    public Integer getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public String getPass() {
        return pass;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this ==obj){
            return true;
        }
        if (obj ==null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.login, other.login)){
            return false;
        }
        if(!Objects.equals(this.pass, other.pass)){
            return false;
        }
        return true;
    }
}
