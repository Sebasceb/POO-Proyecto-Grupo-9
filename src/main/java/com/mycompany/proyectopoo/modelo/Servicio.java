package  modelo;

public class Servicio{
  public String codigo;
  public String nombre;
  public String precio;

  Servicio(String codigo, string nombre, String precio){
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getCodigo(){
    return codigo;
  }

  public String getNombre(){
    return nombre;
  }

  public String getPrecio(){
    return precio;
  }
}
