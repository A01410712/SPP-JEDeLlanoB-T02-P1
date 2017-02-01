/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jedellanob.t02.p1;
import java.util.*;
/**
 *
 * @author mac
 */
public class SPPJEDeLlanoBT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double base, altura,sup,per;//Se declaran las variables
       
       Scanner datos = new Scanner(System.in);
       //Se piden los datos por teclado
          System.out.println("Escribe la base");
             base=datos.nextDouble();
              System.out.println("Ingresa la altura");
              altura=datos.nextDouble();
        
             sup=(base*altura);//Para calcula la superficie o área
        
          System.out.println("La superficie es: " + sup);//Resultado
        
              per=((base*2)+ (altura*2));//Calcula perimetro
        
          System.out.println("El perímetro del rectangulo es: " + per);//Resultado
          
     }
    
}