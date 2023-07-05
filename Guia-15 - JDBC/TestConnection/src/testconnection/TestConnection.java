/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author no_de
 */
public class TestConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
        // TODO code application logic here
            Class.forName("com.mysql.jdbc.Driver"); 
            String url= "jdbc:mysql://localhost:3306/nba";
            Connection con = DriverManager.getConnection(url, "root", "root");
    }
    
}
