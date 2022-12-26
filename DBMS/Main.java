/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBMS;

/**
 *
 * @author MauricioPC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DBMS db = DBMSFactory.getDatabaseManagementSystem("MySQL");
        db.setName("Banca");
        db.setUser("root");
        db.setPassword("1A2s3d4f");
        System.out.println(db.getStringConnection());
    }
    
}
