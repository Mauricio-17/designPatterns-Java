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
public class PostgreSQL extends DBMS{

    @Override
    public String getStringConnection() {
        return "PostgreSQL/localhost:5432//"+super.getName()+"/"+super.getUser()+":"+super.getPassword();
    }
    
}
