/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprimerparcial.MenusAdministrador;
import java.util.*;
/**
 *
 * @author Sebasceb
 */
public class MenuAdmin {
    public ArrayList<Cliente> listaClientes;
    public ArrayList<Proveedor> listaProveedores;
    public ArrayList<Servicio> listaServicios;
  
  /*
  public MenuAdmin(String u, String c, String n, String ni){
    super(u,c,n,ni);
  }
  */


  public void menuPrincipal(){
    int check=0;
    while(check==0){
      Scanner sc = new Scanner(System.in);
      System.out.println("1. Administrar Clientes\n2. Administrar Proveedores\n3. Admninistrar Servicios");
      int opcion=sc.nextInt();
      switch(opcion){
        case 1:
          administrarCliente();
        case 2:
          administrarProveedor();
        case 3:
          administrarServicios();  
        default:
          sc.close();
      }
  
      
    }
    
  }
  
  public void administrarCliente(){
    System.out.println(listaClientes);

    Scanner sc = new Scanner(System.in);
    int a= 0;
    while(a!=1 && a!=2){
      System.out.println("1. Agregar Cliente \n2. Regresar a menú principal");
      a= sc.nextInt();
      sc.nextLine(); 
      if(a==2){
        sc.close();
        return;
      }
      if(a==1){
       System.out.println("Ingrese el nombre del cliente: ");
        String nombre= sc.nextLine();
    
        System.out.println("Ingrese la dirección del cliente: ");
        String direccion= sc.nextLine();
    
        System.out.println("Ingrese el numero de teléfono del cliente: ");
        String telefono= sc.nextLine();
        
        String codigo= "Falta hacer codigo";
    
        listaClientes.add(new Cliente(codigo, nombre, direccion, telefono)); 
      }
    }
    sc.close();
  }

  public void administrarProveedor(){
    System.out.println(listaProveedores);

    Scanner sc = new Scanner(System.in);
    int a= 0;
    while(a!=1 && a!=2){
      System.out.println("1. Agregar Proveedor \n2. Regresar a menú principal");
      a= sc.nextInt();
      sc.nextLine(); 
      if(a==2){
        sc.close();
        return;
      }
      if(a==1){
        System.out.println("Ingrese el nombre del proveedor: ");
        String nombre= sc.nextLine();

        System.out.println("Ingrese la dirección del proveedor: ");
        String direccion= sc.nextLine();

        System.out.println("Ingrese el numero de teléfono del proveedor: ");
        String telefono= sc.nextLine();

        String codigo= "Falta hacer codigo";
    
        listaProveedores.add(new Proveedor(codigo, nombre, direccion, telefono)); 
      }
    }
    sc.close();
    
  }

  public void administrarServicios(){
    System.out.println(listaProveedores);

    Scanner sc = new Scanner(System.in);
    int a= 0;
    while(a!=1 && a!=2){
      System.out.println("1. Agregar Servicio \n2. Regresar a menú principal");
      a= sc.nextInt();
      sc.nextLine(); 
      if(a==2){
        sc.close();
        return;
      }
      if(a==1){
       System.out.println("Ingrese el nombre del servicio: ");
        String nombre= sc.nextLine();
    
        System.out.println("Ingrese el precio(##.##): ");
        float servicio= sc.nextFloat();
        
        String codigo= "Falta hacer codigo";
    
        listaServicios.add(new Servicio(codigo, nombre, servicio)); 
      }
    }
    sc.close();
    
  
  }
    
}
