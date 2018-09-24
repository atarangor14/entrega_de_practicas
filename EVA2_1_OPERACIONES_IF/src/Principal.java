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
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        
    
        System.out.println("CUAL ES TU CALIFICACION EN FUNDAMENTOS DE PROGRAMACION");
        double sCalificacion;
        
        sCalificacion = input.nextDouble();
        
        if (sCalificacion >= 70) {
            System.out.println("YA PASASTE");
        } 
    else {
            System.out.println("NO PASASTE");
        }
    }

 }
    
