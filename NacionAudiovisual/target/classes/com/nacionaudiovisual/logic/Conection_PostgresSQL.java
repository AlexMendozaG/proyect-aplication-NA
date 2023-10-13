package com.nacionaudiovisual.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conection_PostgresSQL {
    
    Connection conection = null;
    
    String user = "postgres";
    String passsword = "root";
    String bd = "nacionAudiovisual";
    String ip = "localhost";
    String port = "5432";
    
    String direction = "jdbc:postgresql://"+ip+":"+port+"/"+bd;
    
    public Connection conectBD(){
        
        try{
            
            Class.forName("org.postgresql.Driver");
            conection = DriverManager.getConnection(direction,user,passsword);
            //"jdbc:postgresql://localhost:5432/pm18101", "pm18101", "prn315PM18101"
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        
        return conection;
    }
    
}
