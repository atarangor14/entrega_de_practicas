
import java.util.Scanner;
import java.lang.Math;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atara
 */
public class PRINCIPAL {
 private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("operaciones con fracciones");
        System.out.println("primera fraccion");
        System.out.println("dame el numerador ");
        int numf1;
        
        numf1 = input.nextInt();
        System.out.println("dame el denominador");
        int denom1;
        
        denom1 = input.nextInt();
        System.out.println("dame la segunda fraccion");
        System.out.println("dame el numerador ");
        int numf2;
        
        numf2 = input.nextInt();
        System.out.println("dame el denominador");
        int denom2;
        
        denom2 = input.nextInt();
        System.out.println("que operacion quieres hacer 1- multiplicar 2-restar 3-sumar");
        int eRespuesta;
        
        eRespuesta = input.nextInt();
        int valor1;
        int valor2;
        
        if (eRespuesta == 1) {
            valor1 = numf1 * numf2;
            valor2 = denom1 * denom2;
        } else {
            if (eRespuesta == 2) {
                valor1 = numf1 * denom2 - denom1 * numf2;
                valor2 = denom1 * denom2;
            } else {
                valor1 = numf1 * denom2 + denom1 * numf2;
                valor2 = denom1 * denom2;
            }
        }
        System.out.println("el resultado es ");
        System.out.print(valor1);
        System.out.print("/");
        System.out.println(valor2);
    }
}

    
    

