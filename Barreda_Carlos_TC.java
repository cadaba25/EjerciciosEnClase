/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author David Barreda
 */
public class Barreda_Carlos_TC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        int menu = 0;
        System.out.println("(1) Triangulos");
        System.out.println("(2) Maximo comun divisor y minimo comun divisor");
        System.out.println("(3) Numero perfecto");
        while(menu !=4 )
            if(menu == 1){
                
            
                            try{
                            int triangulos = 0;
                            int contador = 1;
                            double mayorarea = 0;
                            int trianguloarea = 0;

                            while(triangulos < 8){


                                    System.out.println("Ingrese la base del triangulo #" + contador );
                                    double base = lea.nextDouble();
                                    System.out.println("Ingrese la altura del triangulo #"+ contador);
                                    double altura = lea.nextDouble();
                                    double area = (base*altura)/2;
                                    System.out.println("El area del triangulo #"+ contador + " = " + area);


                                    if( area>mayorarea){

                                        mayorarea = area;
                                        trianguloarea = contador;


                                    }
                                    contador ++;
                                    triangulos ++;
                            } 

                             System.out.println("El triangulo con mayor area es "+ trianguloarea + " con una area de: " + mayorarea );

                         }catch(Exception e){
                                    System.out.println("no puede ejecutar la division");

                                    }
            }else if(menu ==2 ){
                
                
                
                
                
                
                
            }          
    }      
}





