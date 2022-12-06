package modelo;

public abstract class Usuario{
  public String usuario;
  public String contraseña;
  public String nombre;
  public String nivel; //admin, cobranzas, tecnico

  Usuario(String usuario, String contraseña, String nombre, String nivel){
    this.usuario = usuario;
    this.contraseña = contraseña;
    this.nombre = nombre;
    this.nivel = nivel;
  }
}