
import java.util.Scanner;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dame tu nombre: ");
        String sNombre;//DECLARANDO
        Scanner sInput;//DECLARANDO
        //SCANNER ES UNA CLASE, PARA USAR CLASES
        //SE HACE A TRAVES DE OBJETOS 
        //SE CREAN CON PALABRA NEW
         sInput = new Scanner (System.in);
        sNombre= sInput.nextLine();
        System.out.println("Tu nombre es: "+sNombre);
        
        
        
            
    }
    
}
