/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

/**
 *
 * @author Usuario
 */
public class Proveedor extends etc{
    protected String telefono;
    
    //getset
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }
    
    //constructor
    public Proveedor(String codigo,String nombre,String direccion, String telefono){
        super(codigo,nombre,direccion);
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        //Agregamos al metodo toString de la clase Padre el estado del Empleado
        return super.toString()+", Telefono: "+telefono;
    }
    
}
