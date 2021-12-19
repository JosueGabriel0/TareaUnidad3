package pe.edu.upeu.jgom.dao;

import java.io.Console;

import pe.edu.upeu.jgom.data.AppCrud;
import pe.edu.upeu.jgom.modelo.UsuarioTO;
import pe.edu.upeu.jgom.utils.LeerArchivo;
import pe.edu.upeu.jgom.utils.LeerTeclado;
import pe.edu.upeu.jgom.utils.UtilsX;



public class Usuariodao extends AppCrud {

    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();
    final String TABLA_USUARIO="Usuario.txt";

    LeerArchivo leerArch;
    UsuarioTO usuTO;


    public void crearUsuario() {
        util.clearConsole();
        leerArch=new LeerArchivo(TABLA_USUARIO);
        usuTO=new UsuarioTO();
        usuTO.setUsuario(leerTecla.leer("", "Ingrese su Usuario"));

        Console cons=System.console();
        System.out.println("Ingrese su clave:");
        char[] dataPass=cons.readPassword();
        usuTO.setPassword(String.valueOf(dataPass));
        usuTO.setPerfil(leerTecla.leer("","Ingrese el perfil (VENDEDOR/ADMINISTRADOR)"));
        oagregarContenido(leerArch, usuTO);

    }


    public boolean login(){
        util.clearConsole();
        System.out.println("*********Autentication System**********");
        leerArch=new LeerArchivo(TABLA_USUARIO);
        String user=leerTecla.leer("","Ingrese su usuario");
        Object[][] data=obuscarContenido(leerArch, 0, user);
        Console cons=System.console();
        System.out.println("Ingrese su clave:");
        char[] dataPass=cons.readPassword();        

        if(data.length==1 && data[0][1].equals(String.valueOf(dataPass))){
            return true;
        }
        return false;
    }



    
}
