package modelo;
import java.util.Scanner;
import java.util.ArrayList;

public class FacturaEmpresas{
  public int codEmpresa;
  public int anio;
  public int mes;
  public ArrayList<Orden> listaOrdenes;
  

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