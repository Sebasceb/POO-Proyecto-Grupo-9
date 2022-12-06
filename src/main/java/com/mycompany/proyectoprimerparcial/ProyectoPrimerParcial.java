/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoprimerparcial;

/**
 *
 * @author Sebasceb
 */
public class ProyectoPrimerParcial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario:");
        String usuario = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contrasena = sc.nextLine();
       // Usuario login = new Usuario(usuario, contrasena);
        
        for (Usuario u : Usuario.getListaUsuarios()){
            if(usuario.compareTo(u.getUsuario())== 0){
                if(contrasena.compareTo(u.getContrasena())==0){
                    if(u.getNivel() == TipoUsuario.ADMIN){
                        menuAdmin.menuPrincipal();
                    }else if(u.getNivel() == TipoUsuario.COBRANZA){
                        menuCobranza.menuPrincipal();
                    }else{
                        menuTecnico.menuPrincipal();
                    }
                }else{
                    System.out.println("Contraseña incorrecta");
                }
            }else{
                System.out.println("No existe el usuario");
                }
            }
        }
        
        
      /*  for (Usuario u : Usuario.getListaUsuarios()){
            if(login.usuario.equals(u.getUsuario())){
                if(login.contrasena.equals(u.getContrasena())){
                    if(u.getNivel() == TipoUsuario.ADMIN){
                        menuAdmin.menuPrincipal();
                    }else if(u.getNivel() == TipoUsuario.COBRANZA){
                        menuCobranza.menuPrincipal();
                    }else{
                        menuTecnico.menuPrincipal();
                    }
                }else{
                    System.out.println("Contraseña incorrecta");
                }
            }else{
                System.out.println("No existe el usuario");
            }
       */ }
    }
}
