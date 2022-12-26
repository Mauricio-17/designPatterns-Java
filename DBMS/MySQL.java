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
public class MySQL extends DBMS{

    @Override
    public String getStringConnection() {
        return "MySQL/localhost:3306//"+super.getName()+"/"+super.getUser()+":"+super.getPassword();
    }
    
}
