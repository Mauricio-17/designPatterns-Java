/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronSingleton;

/**
 *
 * @author Mauricio Solis Cipriano
 */
public class Main {
    
    public static void main(String[] args) {
        SoyUnico ricardo = SoyUnico.getSingletonInstance("Ricardo Moya");
        SoyUnico ramon = SoyUnico.getSingletonInstance("Ramon Ardiles");
        
        System.out.println(ramon.getNombre());
        System.out.println(ricardo.getNombre());
        
        try{
            SoyUnico richard = ricardo.clone();
            System.out.println(richard);
        }catch(NullPointerException npe){
            System.out.println("NullPointerException thrown!");            
        }
        
    }
}
