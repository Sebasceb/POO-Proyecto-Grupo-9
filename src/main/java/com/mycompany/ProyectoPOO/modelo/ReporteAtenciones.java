package modelo;
import java.util.Scanner;
import java.util.ArrayList;


public class ReporteAtenciones{
  public ArrayList<Tecnico> listaTecnicos;
  double ganancia = 0;

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
        Servicio sv = od.getServicio();
        
        if(od.getMes() == mes){
          double precio = sv.getPrecio();
          int cant = od.getCantidad();
          ganancia += precio * cant;
        }
        System.out.println(tc.getNombre()+"          "+ganancia); 
      } 
    }
  }
}