package OCPPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User911-09
 */
public abstract class Coche {
    
    abstract int precioMedioCoche();
    
    public static void imprimirPrecioMedioCoche(Coche[] arrayCoches){
        for (Coche coche: arrayCoches){
            System.out.println(coche.precioMedioCoche());
        }
    }
}
