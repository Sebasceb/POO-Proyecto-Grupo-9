package  modelo;

public class Cliente{
  public String codigo;
  public String nombre;
  public String direccion;
  public String telefono;
  public String tipo; //personl o empresarial

  Servicio(String codigo, string nombre, String direccion, String telefono, String tipo){
    this.codigo = codigo;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.tipo = tipo;
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

  public String getTipo(){
    return tipo;
  }
}