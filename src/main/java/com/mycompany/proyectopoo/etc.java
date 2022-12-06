/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

/**
 *
 * @author Usuario
 */
public class etc {
    protected String codigo;
    protected String nombre;
    protected String direccion;
    
    public etc(String codigo, String nombre, String direccion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return String.format("Codigo: %s ,Nombre: %s ,Direccion: %s ,Telefono: %s", codigo, nombre, direccion); 
    }  
}
