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
public class Principla {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Dame tu nombre");
        String sNombre;
        
        sNombre = input.nextLine();
        System.out.println("Que edad  tienes ?");
        int iEdad;
        
        iEdad = input.nextInt();
        System.out.print("Tu nombre es: ");
        System.out.println(sNombre);
        System.out.println("y tu año de nacimiento es");
        System.out.println(2018 - iEdad);
    }
}

    
