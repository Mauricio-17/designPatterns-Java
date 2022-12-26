package OCPPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauricio Solis Cipriano
 */
public class Main {
    
    public static void main(String[] args) {
        Coche[] arrayCoches = {
            new Renault(), new Mercedes(), new Audi()
        };
        
        Coche.imprimirPrecioMedioCoche(arrayCoches);
    }
    
}
