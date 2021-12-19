package pe.edu.upeu.jgom;

import pe.edu.upeu.jgom.dao.Usuariodao;
import pe.edu.upeu.jgom.tarea3.ResolucionTarea3;
import pe.edu.upeu.jgom.tarea3.Tarea3InteraccionConElUsuario;
import pe.edu.upeu.jgom.utils.LeerTeclado;

import pe.edu.upeu.jgom.zDecoracionNavideña.FelizNavidad;

public class MenuPrincipal {

     //Reset
  public static final String ANSI_RESET = "\u001B[0m";
  //Colores de letra
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  //Colores de fondo
  public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
  public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
  public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
  public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
  public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
  public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
  public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
  public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    ResolucionTarea3 f=new ResolucionTarea3();
    Tarea3InteraccionConElUsuario t=new Tarea3InteraccionConElUsuario();
    LeerTeclado lt1=new LeerTeclado();
    FelizNavidad n=new FelizNavidad();

    Usuariodao uDao;

    public void mainLogin(){
        uDao=new Usuariodao();
      if (uDao.login()) {

        menuprincipal();

        
      }else{
        System.out.println("Intente Nuevamente!!");
        mainLogin();
      }

    }
    

    public void menuprincipal(){
      System.out.println(ANSI_GREEN_BACKGROUND+ANSI_BLACK+"\n°°°°°°°°°°°°°°°°°°°°°°°°°Bienvenido al programa de la tarea 3 by JGOM!°°°°°°°°°°°°°°°°°°°°°°°°°"+ANSI_RESET);
        System.out.println("\n"+ANSI_BLUE_BACKGROUND+ANSI_WHITE+"-----------------------------Bienvenido al menú PRINCIPAL-----------------------------"+ANSI_RESET);
       int y = lt1.leer(0, "\n"+ANSI_CYAN_BACKGROUND+ANSI_BLACK+"Elija el numero del ejercicio a revisar:"+ANSI_RESET+"\n"+
        ANSI_YELLOW+"\n1"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 5|"+ANSI_RESET+
        ANSI_YELLOW+"\n2"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 6|"+ANSI_RESET+
        ANSI_YELLOW+"\n3"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 7|"+ANSI_RESET+
        ANSI_YELLOW+"\n4"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 8|"+ANSI_RESET+
        ANSI_YELLOW+"\n5"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 9|"+ANSI_RESET+
        ANSI_YELLOW+"\n6"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 10|"+ANSI_RESET+
        ANSI_YELLOW+"\n7"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 11|"+ANSI_RESET+
        ANSI_YELLOW+"\n8"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 12|"+ANSI_RESET+
        ANSI_YELLOW+"\n9"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 13|"+ANSI_RESET+
        ANSI_YELLOW+"\n10"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 14|"+ANSI_RESET+
        ANSI_YELLOW+"\n11"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 17|"+ANSI_RESET+
        ANSI_YELLOW+"\n12"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 18|"+ANSI_RESET+
        ANSI_YELLOW+"\n13"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_YELLOW+"|Ingresar al menú SECUNDARIO (LOS MISMOS EJERCICIOS PERO CON INTERACCIÓN CON LA PERSONA)|"+ANSI_RESET+
        ANSI_YELLOW+"\n0"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_RED+"|Para cerrar el programa digite el numero 0|\n"+ANSI_RESET);
        

        while (y!=0){
            switch(y){
                case 1: f.ejercicio5();;break;

                case 2: f.ejercicio6();;break;

                case 3: f.ejercicio7();;break;

                case 4: f.ejercicio8();;break;

                case 5: f.ejercicio9();break;                

                case 6: f.ejercicio10();break;

                case 7: f.ejercicio11();break;

                case 8: f.ejercicio12();;break;

                case 9: f.ejercicio13();;break;

                case 10: f.ejercicio14();;break;

                case 11: f.ejercicio17();;break;

                case 12: f.ejercicio18();;break;

                case 13: menusecundario();

                default: System.out.println("Error, elija una opcion existente!");

            }
            System.out.println(ANSI_YELLOW+"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+ANSI_RESET);
            n.felizNavidad();
            y = lt1.leer(0,"\n"+ANSI_CYAN_BACKGROUND+ANSI_BLACK+"Elija el numero del ejercicio a revisar:"+ANSI_RESET+"\n"+
            ANSI_YELLOW+"\n1"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 5|"+ANSI_RESET+
            ANSI_YELLOW+"\n2"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 6|"+ANSI_RESET+
            ANSI_YELLOW+"\n3"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 7|"+ANSI_RESET+
            ANSI_YELLOW+"\n4"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 8|"+ANSI_RESET+
            ANSI_YELLOW+"\n5"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 9|"+ANSI_RESET+
            ANSI_YELLOW+"\n6"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 10|"+ANSI_RESET+
            ANSI_YELLOW+"\n7"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 11|"+ANSI_RESET+
            ANSI_YELLOW+"\n8"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 12|"+ANSI_RESET+
            ANSI_YELLOW+"\n9"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 13|"+ANSI_RESET+
            ANSI_YELLOW+"\n10"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 14|"+ANSI_RESET+
            ANSI_YELLOW+"\n11"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 17|"+ANSI_RESET+
            ANSI_YELLOW+"\n12"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 18|"+ANSI_RESET+
            ANSI_YELLOW+"\n13"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_YELLOW+"|Ingresar al menú SECUNDARIO (LOS MISMOS EJERCICIOS PERO CON INTERACCIÓN CON LA PERSONA)|"+ANSI_RESET+
            ANSI_YELLOW+"\n0"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_RED+"|Para cerrar el programa digite el numero 0|\n"+ANSI_RESET);
        }
    }


    public void menusecundario(){
        System.out.println("\n"+ANSI_BLUE_BACKGROUND+ANSI_WHITE+"-----------------------------Bienvenido al menú SECUNDARIO-----------------------------"+ANSI_RESET);
        int y = lt1.leer(0, "\n"+ANSI_CYAN_BACKGROUND+ANSI_BLACK+"Elija el numero del ejercicio a revisar (Interaccion con la persona):"+ANSI_RESET+"\n"+
         ANSI_YELLOW+"\n1"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 5 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n2"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 6 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n3"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 7 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n4"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 8 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n5"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 9 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n6"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 10 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n7"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 11 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n8"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 12 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n9"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 13 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n10"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 14 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n11"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 17 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n12"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 18 (Interaccion con la persona)|"+ANSI_RESET+
         ANSI_YELLOW+"\n0"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_RED+"|Para cerrar el programa y volver al menu principal digite el numero 0|\n"+ANSI_RESET);
         
 
         while (y!=0){
             switch(y){
                 case 1: t.ejercicio5In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);;break;
 
                 case 2: t.ejercicio6In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);;break;
 
                 case 3: t.ejercicio7In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);;break;
 
                 case 4: t.ejercicio8In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);;break;
 
                 case 5: t.ejercicio9In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);break;                
 
                 case 6: t.ejercicio10In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);break;
 
                 case 7: t.ejercicio11In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);break;
 
                 case 8: t.ejercicio12In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);;break;
 
                 case 9: t.ejercicio13In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);;break;
 
                 case 10: t.ejercicio14In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);;break;
 
                 case 11: t.ejercicio17In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);;break;
 
                 case 12: t.ejercicio18In(lt1.leer(0, "Ingrese la dimension de la matriz"),0);;break;
 
                 default: System.out.println("Error, elija una opcion existente!");
 
             }
             System.out.println(ANSI_YELLOW+"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+ANSI_RESET);
             n.felizNavidad();
             y = lt1.leer(0,"\n"+ANSI_CYAN_BACKGROUND+ANSI_BLACK+"Elija el numero del ejercicio a revisar (Interaccion con la persona):"+ANSI_RESET+"\n"+
             ANSI_YELLOW+"\n1"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 5 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n2"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 6 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n3"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 7 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n4"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 8 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n5"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 9 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n6"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 10 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n7"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 11 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n8"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 12 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n9"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 13 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n10"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 14 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n11"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 17 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n12"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_CYAN+"|Ejercicio 18 (Interaccion con la persona)|"+ANSI_RESET+
             ANSI_YELLOW+"\n0"+ANSI_RESET+ANSI_GREEN+" = "+ANSI_RESET+ANSI_RED+"|Para cerrar el programa y volver al menu principal digite el numero 0|\n"+ANSI_RESET);
         }
     }

}
   
