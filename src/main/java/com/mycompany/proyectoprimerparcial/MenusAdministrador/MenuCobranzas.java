package com.mycompany.proyectoprimerparcial.MenusAdministrador;

import java.util.ArrayList;
import java.util.Scanner;

class MenuCobranzas {
    public ArrayList<Usuario> listaTecnicos;
    double ganancia = 0;
    public ArrayList<Orden> listaOrdenes;
    public ArrayList<Orden> ordenesFinal;
    int cantidades = 0;
    public int codEmpresa;
    public int anio;
    public int mes;
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean salir = false;
    int opcion;
  
    
    while(!salir){
      System.out.println("1. Generar facturas de empresas");
      System.out.println("2. Reporte de ingresos por servicios");
      System.out.println("3. Reporte de atenciones por técnico");
      System.out.println("4. Salir");
          
      System.out.println("Escoge una de las opciones");
      opcion = sc.nextInt();
          
      switch(opcion){
        case 1:
          System.out.println("Opcion 1");
          break;
        case 2:
          System.out.println("Opcion 2");
          break;
        case 3:
          System.out.println("Opcion 3");
          break;
        case 4:
          System.out.println("Opcion 4");
          salir = true;
          break;
        default:
          System.out.println("Solo opciones del 1 al 4");
                  
      }
          
    }
  }
  public void recaudacionTecnicos(){
    Scanner sn = new Scanner(System.in);

    System.out.println("Ingrese año a consultar: ");
    int anio = sn.nextInt();
    sn.nextLine();
    System.out.println("Ingrese mes a consultar: ");
    int mes = sn.nextInt();
    sn.nextLine();

    System.out.println("Técnico          Total");
    
    for(int i=0;listaTecnicos.size();i++){
      Tecnico tc = listaTecnicos.get(i);
      ArrayList<Orden> listaOrdenes = tc.getOrdenes();
      
      for(Orden od: listaOrdenes){
        modelo.Servicio sv = od.getServicio();
        
        if(od.getMes() == mes){
          double precio = sv.getPrecio();
          int cant = od.getCantidad();
          ganancia += precio * cant;
        }
        System.out.println(tc.getNombre()+"          "+ganancia); 
      } 
    }
  }
    public void generarFacturasEmpresas(){
        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese los siguientes datos");
        System.out.println("Codigo de la empresa: ");
        codEmpresa = sn.nextInt();
        sn.nextLine();
        System.out.println("Año y mes a consultar (mm-aa): ");
        anio = sn.nextInt();
        mes = sn.nextInt();

        //Orden os = new Orden(codEmpresa,fecha,1,"GBGNG",ArrayList<Servicio> servicios,cantidad);
        System.out.println("Empresa: ");
        System.out.println("Periodo de facturación: "+mes+" "+anio);
        System.out.println("Detalle de servicios: ");
        System.out.println("#Placa      Fecha    Tipo    Servicio    Cantidad      Total");
        for(Orden od:listaOrdenes){
          if(od.getCodigo()==codEmpresa && od.getMes()==mes){
            System.out.println(od.getPlaca+"    "+od.getFecha+"    "+od.getTipo+"    "+od.getServicio+"    "+od.getCantidad+"    "+od.getPago);
            int totalPagar += od.getPago;
          } 
          System.out.println("Total a pagar: "+totalPagar);
        }
    
    }
    
  }
}