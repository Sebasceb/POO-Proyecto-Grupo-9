/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AdministrarAdmin {
    protected static ArrayList<Cliente> clientes;
    protected static ArrayList<Proveedor> proveedores;
    protected static ArrayList<Tecnico> tecnicos;
    
    private Scanner input;
    public AdministrarAdmin(){}
    public AdministrarAdmin(Scanner input){
        this.clientes = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.tecnicos = new ArrayList<>();
        this.input = input;
        
        this.clientes.add(new Cliente("123","Nombre","Direccion","12345"));
        
    }
    
    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public static ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }
    public static ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }
    
    public void listaProveedor() {
        System.out.println("\nLos Proveedores son: ");
        if(!proveedores.isEmpty()){
          for(int i = 0;  i < proveedores.size(); i++){ 
            System.out.printf("%d) %s\n", i+1, proveedores.get(i));
          }
        }else{
            System.out.printf("no hay proveedores disponibles");
          }
    }
    
    public void agregarProveedor(){

        System.out.println("Ingrese el nombre de el proveedor: ");
        String nombre = input.nextLine();

        System.out.println("Ingrese el direccion de el proveedor: ");
        String direccion = input.nextLine();

        System.out.println("Ingrese el telefono de el proveedor: ");
        String telefono = input.nextLine();

        //codigo anterior +1
        String codigo = "1";
        
        Proveedor proveedorsub = new Proveedor(codigo, nombre, direccion, telefono);

        this.proveedores.add(proveedorsub);

        listaProveedor();
    }
    
    
    public void administrarCliente(Cliente c){
        
    }
    public void administrarProovedor(Proveedor p){
        
    }
    public void administrarTecnico(Tecnico t){
        
    }
}
