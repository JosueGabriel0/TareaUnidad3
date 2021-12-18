package pe.edu.upeu.jgom.tarea3;
import pe.edu.upeu.jgom.utils.LeerTeclado;

public class ResolucionTarea3{
    
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

    LeerTeclado lt3 = new LeerTeclado();

    //Ejercicio 5 prueba
    public void ejercicio5(){
        Object matriz5 [][] =new Object[5][5];
        int num=0;
        for (int f = 0; f < matriz5.length; f++){
            for (int c = (matriz5[0].length)-1; c>=(matriz5[0].length-1)-f; c--){
                matriz5[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 5 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz5);

    }

    //Ejercicio 6
    public void ejercicio6(){
        int num=0;
        Object matriz6[][] = new Object[5][5];

        for (int f=0; f < matriz6.length; f++){
            for (int c = 0; c <= f; c++) {
                matriz6[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 6 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz6);   
    } 

    //Ejercicio 7
    public void ejercicio7(){
        int num=0;
        Object matriz7[][] = new Object[5][5];

        for (int i = 0; i < matriz7.length; i++){
            for (int j = 0; j < matriz7[0].length-i; j++){
                matriz7[i][j]= num;
                num++;
                
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 7 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz7);
    }

    //Ejercicio 8
    public void ejercicio8(){
        int num=0;
        Object matriz8 [][] =new Object[5][5];

        for (int f = 0; f < matriz8.length; f++){
            for (int c = 0 +f; c < matriz8[0].length; c++) {
                matriz8[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 8 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz8);
    }
    
    //Ejercicio 9
    public void ejercicio9(){
        Object matriz9 [][] =new Object[5][5];

        int num = 0;

        for (int f = 0; f < matriz9.length; f++) {
            for (int c = ((matriz9[0].length)-1)-f; c <=(matriz9[0].length)-1 ; c++) {
                matriz9[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 9 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz9);



    }

    //Ejercicio 10
    public void ejercicio10(){
        Object matriz10 [][]= new Object[5][5];
        int num=0;
        for (int f = 0; f < matriz10.length; f++){
            for (int c = 0+f; c >= 0; c--){
                matriz10[f][c]=num;       
                num++;         
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 10 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz10);


    }

    //Ejercicio 11
    public void ejercicio11(){
        Object matriz11 [][] = new Object[5][5];
        int num=0;

        for (int f = 0; f < matriz11.length; f++){
            for (int c = ((matriz11[0].length)-1)-f; c >=0 ; c--){
                matriz11[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 11 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz11);

    }

    //Ejercicio 12
    public void ejercicio12(){
        Object matriz12 [][] =new Object[5][5];

        int num = 0;

        for (int f = 0; f < matriz12.length; f++) {
            for (int c = (matriz12[0].length)-1; c >= f ; c--) {
                matriz12[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 12 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz12);

    }

    //Ejercicio 13 
    public void ejercicio13(){
        Object matriz13 [][] =new Object[5][5];
        int num =0;

        for (int c = 0; c < matriz13[0].length; c++){
            for (int f = 0; f < (matriz13.length)-c; f++){
                matriz13[f][c]=num;
                num++;
                
            }
                
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 13 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz13);
        
    }

    //Ejercicio 14
    public void ejercicio14(){
        Object matriz14 [][] =new Object[5][5];
        int num = 0;
            
        for (int c = 0; c < matriz14[0].length; c++){
            for (int f = 0; f <= c; f++){
                matriz14[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 14 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz14);

    }

    //Ejercicio 17
    public void ejercicio17(){
        Object matriz17 [][]= new Object[5][5];
        int num = 0;

        for (int c = (matriz17[0].length)-1; c >= 0; c--){
            for (int f = 0; f <= c; f++){
                matriz17[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 17 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz17);

    }

    //Ejercicio 18
    public void ejercicio18(){
        Object matriz18 [][]= new Object[5][5];
        int num = 0;
        int posicion = 0;
        for (int c = (matriz18[0].length)-1; c >= 0 ; c--){
            for (int f = 0; f <= posicion ; f++){
                matriz18[f][c]=num;
                num++;
                
                
            }
            posicion++;
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 18 es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatriz(matriz18);

    }
    
    //Imprimir
    public void imprimirMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               if(matriz[i][j]!=null){
                System.out.print("|"+matriz[i][j]+"|"+"\t");
                
               }else{
                System.out.print("\t");
               }                               
            }
            System.out.println("");
        }
        
    }    

}