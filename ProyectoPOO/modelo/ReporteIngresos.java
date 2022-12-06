package modelo;
import java.util.Scanner;
import java.util.ArrayList;

public class ReporteIngresos{
  public ArrayList<Orden> listaOrdenes;
  public ArrayList<Orden> ordenesFinal;
  int cantidades = 0

  ArrayList<Orden> listaOrdenes2 = (ArrayList<Orden>)listaOrdenes.clone();
  

  public void ingresosServicios(){
    Scanner sn = new Scanner(System.in);

    System.out.println("Ingrese año a consultar: ");
    int anio = sn.nextInt();
    sn.nextLine();
    System.out.println("Ingrese mes a consultar: ");
    int mes = sn.nextInt();
    sn.nextLine();
    System.out.println("Servicio          Total");
    
    for(int i=0;listaOrdenes2.size();i++){
      Orden other = listaOrdenes2.remove(i);
      //Orden other2 = new Orden(123,"fecha",0,"",other.getServicio(),0);
      int ind = listaOrdenes2.indexOf(other);
      Orden other2 = listaOrdenes2.get(ind);
      
      if(other.getMes() == mes && other.getServicio() == other2.getServicio()){
        cantidades += other.getCantidad() + other2.getCantidad();
        System.out.println(other.getServicio+"          "+(other.getPago()*cantidades);  
      }
    }
  }  
}