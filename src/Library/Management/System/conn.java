/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Management.System;

/**
 *
 * @author harsh
 */
import java.sql.*;

public class conn{
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/Library_Management_Sytem?characterEncoding=latin1","root","Harshad@123");
            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}