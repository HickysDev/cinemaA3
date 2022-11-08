
package com.mycompany.cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "1234";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_wcinema";
    
    public Connection obtemConexao(){
        try{
        Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
        return c;
        } 
        catch(SQLException e){
             return null;
        }
    } 
}
