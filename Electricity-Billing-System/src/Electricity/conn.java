package Electricity;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
          Class.forName("com.mysql.cj.jdbc.Driver"); //we have to register jdbc driver in our program. 
            c =DriverManager.getConnection("jdbc:mysql://localhost:3308/electricityproject","root","");    
            s =c.createStatement();  
            
           }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  