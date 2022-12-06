package modelo;

public class Tecnico extends Usuario{
  Tecnico(String usuario, String contraseña, String nombre){
    super(usuario,contraseña,nombre,"tecnico");
  }
}