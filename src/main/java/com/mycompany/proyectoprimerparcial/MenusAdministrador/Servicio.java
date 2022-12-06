/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprimerparcial.MenusAdministrador;

/**
 *
 * @author Sebasceb
 */
public class Servicio {
    public String codigo;
    public String nombre;
    public float precio;
    public int cantidad;

    public Servicio(String c, String n, float p){
      this.codigo=c;
      this.nombre=n;
      this.precio=p;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null &&  obj instanceof Servicio){
            Servicio other = (Servicio) obj;
            return (codigo==other.codigo);
        }
        else
            return false;
    }
}
