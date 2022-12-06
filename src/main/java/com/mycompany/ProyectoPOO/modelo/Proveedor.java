package  modelo;

public class Proveedor{
  public String codigo;
  public String nombre;
  public String direccion;
  public String telefono;

  Servicio(String codigo, string nombre, String direccion, String telefono){
    this.codigo = codigo;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
  }

  public String getCodigo(){
    return codigo;
  }

  public String getNombre(){
    return nombre;
  }

  public String getDireccion(){
    return direccion;
  }

  public String getTelefono(){
    return telefono;
  }
}