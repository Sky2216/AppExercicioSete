/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexerciciosete;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioSete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     Scanner teclado = new Scanner(System.in);   
        
        double lado,ladoDois,total;
        
        System.out.println("Digite o lado do quadrado");
        
        lado = teclado.nextDouble();
        
        System.out.println("Digite outro lado do quadrado");
    
        ladoDois = teclado.nextDouble();
    
      total = lado * ladoDois;
    
        System.out.println("A area do quadrdado sera de: "+total);
    
    
    
    
    
    
    
    
    
    
    }
    
}
