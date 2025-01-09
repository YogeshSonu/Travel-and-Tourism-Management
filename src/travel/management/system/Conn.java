package travel.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    Conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Driver Initialization
            c=DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","Yogesh$onu664");   //Connection Establishment
            s=c.createStatement();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
