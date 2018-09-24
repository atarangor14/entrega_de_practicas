/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  import java.util.*;


/**
 *
 * @author atara
 */
public class principal {

 
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("DAME LA VELOCIDAD INICIAL");
        double rInicial;
        
        rInicial = input.nextDouble();
        System.out.println("DAME LA VELOCIDAD FINAL ");
        double rFinal;
        
        rFinal = input.nextDouble();
        System.out.println("DAME EL TIEMPO");
        double rTiempo;
        
        rTiempo = input.nextDouble();
        double rDistancia;
        
        rDistancia = (rInicial + rFinal) / 2 * rTiempo;
        System.out.println("LA DISTASNCIA RECORRIDA ES ");
        System.out.println(rDistancia);
    }
}

  
    
    

