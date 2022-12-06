/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprimerparcial.MenusAdministrador;

import java.util.ArrayList;

/**
 *
 * @author Sebasceb
 */
public class Orden{
    public String placa;
    public String fecha;
    public TipoVehiculo tipo;
    public String codigoCliente;
    public ArrayList<Servicio> serviciosDeOrden;
    
    public Orden(String p, String f, TipoVehiculo t, String c){
        this.placa=p;
        this.fecha=f;
        this.tipo=t;
        this.codigoCliente=c;
    }
    
    public void agregarServicio(Servicio s){
        this.serviciosDeOrden.add(s);
    }

    public ArrayList<Servicio> getServiciosDeOrden() {
        return serviciosDeOrden;
    }
    
    
}
