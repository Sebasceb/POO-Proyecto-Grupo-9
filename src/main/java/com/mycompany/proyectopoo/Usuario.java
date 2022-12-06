/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

/**
 *
 * @author Usuario
 */
public abstract class Usuario {
    //atributos
    protected String usuario;
    protected String contrasena;
    
    
    //getterssetters
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    public String getContrasena(){
        return contrasena;
    }
    
    //constructor
    public Usuario(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
}
