package pe.edu.upeu.jgom.zDecoracionNavideña;

public class FelizNavidad {

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

    public void felizNavidad(){
        System.out.println("\n");
        System.out.println(ANSI_CYAN+"  *FELIZ NAVIDAD!!*"+ANSI_RESET);
        String salida="";
        char [] reemplazo = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',};
        for (int i = 9, j=9; j > 0; i++,j--){
            char asterisco='*';
            reemplazo [i]= asterisco;
            reemplazo [j]= asterisco;
            salida=new String(reemplazo);
                System.out.println(ANSI_GREEN+salida+ANSI_RESET);

        }
        System.out.println(ANSI_YELLOW+"        ***\n        ***\n        ***"+ANSI_RESET);
    }

    
}
