!package modelo;

public class Admin extends Usuario{
  Admin(String usuario, String contraseña, String nombre){
    super(usuario,contraseña,nombre,"admin");
  }
}