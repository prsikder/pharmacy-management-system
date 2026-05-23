/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj;
import java.sql.*;
//import project.ConnectionPdr;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class Tables {
    public static void main(String[] args){
        try{
            Connection con = ConnectionPdr.getCon();
            Statement st = con.createStatement();
            st.execute("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(200),address varchar(200))");
            //st.executeUpdate("Insert into appuser (userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','20-08-2003','0000111122','adminreya@email.com','Reya','1234','Bangladesh')");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
