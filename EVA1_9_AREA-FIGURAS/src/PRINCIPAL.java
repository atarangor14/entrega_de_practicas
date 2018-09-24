/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.*;
import java.lang.Math;
/**
 *
 * @author atara
 */
public class PRINCIPAL {
 private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("DAME LA BASE MAYOR: ");
        double rMayor;
        rMayor = input.nextDouble();
         
        System.out.println("DAME LA BASE MENOR: ");
        double rMenor;
         rMenor =input.nextDouble();
       
         System.out.println("DAME LA BASE ALTURA: ");
        double rAltura;
        rAltura=input.nextDouble();
        
        
        double rArea;
        rArea =input.nextDouble();
        rArea = ((rMayor+rMenor)/2)* rAltura;
         
         System.out.print("LA AREA DEL TRAPECIO ES: ");
         System.out.println(rArea);
        
        
    }
    
}
