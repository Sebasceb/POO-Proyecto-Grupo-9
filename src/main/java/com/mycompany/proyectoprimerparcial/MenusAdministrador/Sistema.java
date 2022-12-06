public class Sistema {
    //metodo de inicializar sistema
    public static void inicializarSistema(){
        //se crean los objetos correspondientes
        //Usuarios
        Usuario u1 =  new Usuario("admin1", "12345678", "Administrador",TipoUsuario.ADMIN);
        Usuario u2  = new Usuario("alopez","al123456","Alvaro Lopez",TipoUsuario.TECNICO);
        Usuario u3 = new Usuario("mcastro","mc123456","Maria Castro",TipoUsuario.COBRANZA);
        Usuario u4 = new Usuario("mbarcos","mb123456","Mario Barcos",TipoUsuario.TECNICO);
        Usuario.getListaUsuarios().add(u1);
        Usuario.getListaUsuarios().add(u2);
        Usuario.getListaUsuarios().add(u3);
        Usuario.getListaUsuarios().add(u4);
        
        //Clientes
        
        //Servicios
        
        //Proveedores
        
        //Ordenes
    }
}
