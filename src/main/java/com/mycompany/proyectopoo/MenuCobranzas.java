import java.util.Scanner;

class MenuCobranzas {
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
}