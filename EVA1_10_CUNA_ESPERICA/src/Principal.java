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
public class Principal {
 private static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        System.out.println("cuña esferica");
        System.out.println("dame el radio");
        double rRadio;
        
        rRadio = input.nextDouble();
        System.out.println("dame los grado ");
        double rGrados;
        
        rGrados = input.nextDouble();
        double formula;
        
        formula = (double) 4 / 3 * Math.PI * Math.pow(rRadio, 3) * rGrados / 360;
        System.out.println("el resultado es:");
        System.out.println(formula);
    }
}

