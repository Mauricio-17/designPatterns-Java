/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronSingleton;

/**
 *
 * @author User911-09
 */
public class SoyUnico {
    
    private String nombre;
    private static SoyUnico soyUnico;

    private SoyUnico(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: "+ this.nombre);
    }
    
    public static SoyUnico getSingletonInstance(String nombre){
        if (soyUnico == null){
            soyUnico = new SoyUnico(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto " + nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        return soyUnico;
    }
    
    @Override
    public SoyUnico clone(){
        try{
            throw new CloneNotSupportedException();
        }catch(CloneNotSupportedException ec){
            System.out.println("No se puede clonar un objeto de la clase SoyUnico");
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
