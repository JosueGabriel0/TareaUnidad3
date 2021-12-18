package pe.edu.upeu.jgom.tarea3;

import pe.edu.upeu.jgom.utils.LeerTeclado;

public class Tarea3InteraccionConElUsuario{

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

    LeerTeclado lt4 = new LeerTeclado();

    //Ejercicio 5 Interaccion Con El Usuario
    public void ejercicio5In(int Dimension, int num){
        Object matriz5in [][] =new Object[Dimension][Dimension];

        for (int f = 0; f < matriz5in.length; f++){
            for (int c = (matriz5in[0].length)-1; c>=(matriz5in[0].length-1)-f; c--){
                matriz5in[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 5 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz5in);

    }

    //Ejercicio 6 Interaccion Con El Usuario
    public void ejercicio6In(int Dimension, int num){
        
        Object matriz6in [][] = new Object[Dimension][Dimension];

        for (int f=0; f < matriz6in.length; f++){
            for (int c = 0; c <= f; c++) {
                matriz6in[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 6 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz6in);   
    } 

    //Ejercicio 7 Interaccion Con El Usuario
    public void ejercicio7In(int Dimension, int num){
        
        Object matriz7in [][] = new Object[Dimension][Dimension];

        for (int i = 0; i < matriz7in.length; i++){
            for (int j = 0; j < matriz7in[0].length-i; j++){
                matriz7in[i][j]= num;
                num++;
                
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 7 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz7in);
    }

    //Ejercicio 8 Interaccion Con El Usuario
    public void ejercicio8In(int Dimension, int num){
        
        Object matriz8in [][] =new Object[Dimension][Dimension];

        for (int f = 0; f < matriz8in.length; f++){
            for (int c = 0 +f; c < matriz8in[0].length; c++) {
                matriz8in[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 8 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz8in);
    }
    
    //Ejercicio 9 Interaccion Con El Usuario
    public void ejercicio9In(int Dimension ,int num){
        Object matriz9in [][] =new Object[Dimension][Dimension];

        for (int f = 0; f < matriz9in.length; f++) {
            for (int c = ((matriz9in[0].length)-1)-f; c <=(matriz9in[0].length)-1 ; c++) {
                matriz9in[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 9 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz9in);



    }

    //Ejercicio 10 Interaccion Con El Usuario
    public void ejercicio10In(int Dimension, int num){
        Object matriz10in [][]= new Object[Dimension][Dimension];
        
        for (int f = 0; f < matriz10in.length; f++){
            for (int c = 0+f; c >= 0; c--){
                matriz10in[f][c]=num;       
                num++;         
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 10 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz10in);


    }

    //Ejercicio 11 Interaccion Con El Usuario
    public void ejercicio11In(int Dimension, int num){
        Object matriz11in [][] = new Object[Dimension][Dimension];

        for (int f = 0; f < matriz11in.length; f++){
            for (int c = ((matriz11in[0].length)-1)-f; c >=0 ; c--){
                matriz11in[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 11 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz11in);

    }

    //Ejercicio 12 Interaccion Con El Usuario
    public void ejercicio12In(int Dimension, int num){
        Object matriz12in [][] =new Object[Dimension][Dimension];

        for (int f = 0; f < matriz12in.length; f++) {
            for (int c = (matriz12in[0].length)-1; c >= f ; c--) {
                matriz12in[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 12 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz12in);

    }

    //Ejercicio 13 Interaccion Con El Usuario
    public void ejercicio13In(int Dimension, int num){
        Object matriz13in [][] =new Object[Dimension][Dimension];

        for (int c = 0; c < matriz13in[0].length; c++){
            for (int f = 0; f < (matriz13in.length)-c; f++){
                matriz13in[f][c]=num;
                num++;
                
            }
                
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 13 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz13in);
        
    }

    //Ejercicio 14 Interaccion Con El Usuario
    public void ejercicio14In(int Dimension, int num){
        Object matriz14in [][] =new Object[Dimension][Dimension];
            
        for (int c = 0; c < matriz14in[0].length; c++){
            for (int f = 0; f <= c; f++){
                matriz14in[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 14 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz14in);

    }

    //Ejercicio 17 Interaccion Con El Usuario
    public void ejercicio17In(int Dimension, int num){
        Object matriz17in [][]= new Object[Dimension][Dimension];

        for (int c = (matriz17in[0].length)-1; c >= 0; c--){
            for (int f = 0; f <= c; f++){
                matriz17in[f][c]=num;
                num++;
                
            }
            
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 17 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz17in);

    }

    //Ejercicio 18 Interaccion Con El Usuario
    public void ejercicio18In(int Dimension, int num){
        Object matriz18in [][]= new Object[Dimension][Dimension];
        
        int posicion = 0;
        for (int c = (matriz18in[0].length)-1; c >= 0 ; c--){
            for (int f = 0; f <= posicion ; f++){
                matriz18in[f][c]=num;
                num++;
                
                
            }
            posicion++;
        }
        System.out.println(ANSI_CYAN+"<------------"+ANSI_RESET+ANSI_YELLOW+"La matriz del ejercicio 18 (Interaccion con la persona) es:"+ANSI_RESET+ANSI_CYAN+"------------>"+ANSI_RESET+"\n");
        imprimirMatrizIn(matriz18in);

    }
    
    //Imprimir Matriz Interaccion Con El Usuario
    public void imprimirMatrizIn(Object[][] matriz) {
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
