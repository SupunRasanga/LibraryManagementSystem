/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Supun Rasanga
 */
public class DBConnect {
    
    public static Connection connect(){
     Connection conn = null;
     
     try
     {
        Class.forName("com.mysql.jdbc.Driver"); 
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bandaranayaka_college_lms", "root", "");
         
     }catch(Exception e)
     {
          
         System.out.println("NOT CONNECTED");
     }
     
     return conn;
}

    public static Connection geton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
