/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj;

import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPdr {
    public static Connection getCon()
    {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/f_pharmacy", "root", "");
            return conn;
        }       
        catch(Exception e) {
            return null;
        }
    }
}

