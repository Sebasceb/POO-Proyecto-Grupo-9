/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

/**
 *
 * @author Usuario
 */
public class Orden {
    //atributos
    public String codigoCliente;
    public String fechaServicio;
    public String tipoVehiculo;
    public String placaVehiculo;
    
    //getters
    public String getCodigoCliente(){
        return codigoCliente;
    }
    public String getFechaServicio(){
        return fechaServicio;
    }
    public String getTipoVehiculo(){
        return tipoVehiculo;
    }
    public String getPlacaVehiculo(){
        return placaVehiculo;
    }
    
    //constructor
    public Orden(String cc, String fs, String tv, String pv){
        codigoCliente = cc;
        fechaServicio = fs;
        tipoVehiculo = tv;
        placaVehiculo = pv;
    }
}
