/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

/**
 *
 * @author Usuario
 */
public class Cliente extends etc{
    protected String tipoDeCliente;
    
    //
    public void setTipoDeCliente(String tipoDeCliente){
        this.tipoDeCliente = tipoDeCliente;
    }
    public Cliente(String codigo, String nombre, String direccion, String tipoDeCliente){
        super(codigo,nombre,direccion);
        this.tipoDeCliente = tipoDeCliente;
    }
}
