package com.mycompany.proyectoprimerparcial.MenusAdministrador;

public abstract class Usuario{
  public String usuario;
  public String contraseña;
  public String nombre;
  public TipoUsuario nivel;

  Usuario(String usuario, String contraseña, String nombre, TipoUsuario nivel){
    this.usuario = usuario;
    this.contraseña = contraseña;
    this.nombre = nombre;
    this.nivel = nivel;
  }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoUsuario getNivel() {
        return nivel;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(TipoUsuario nivel) {
        this.nivel = nivel;
    }
  
}