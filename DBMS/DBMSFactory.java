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
public class DBMSFactory {
    
    public static DBMS getDatabaseManagementSystem(String database){
        if (database.equalsIgnoreCase("mysql")){
            return new MySQL();
        }
        return new PostgreSQL();
    }
}
