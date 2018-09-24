
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * 
 * 
 */

/**
 *
 * @author ALEJANDRO TARANGO
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int iVal = 10;
        Ejemplo eMiObjetoEjem;
        eMiObjetoEjem = new Ejemplo();
        Ejemplo eObj2 = new Ejemplo();
        
        System.out.println(eObj2);
        
        OtraClase oOtroObj = new OtraClase();
        
    }
    
}
//tipos abstractos de datos 
class Ejemplo //categorias 
{
    int iVal= 10;
}
