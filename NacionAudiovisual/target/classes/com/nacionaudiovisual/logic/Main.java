package com.nacionaudiovisual.logic;

import com.nacionaudiovisual.gui.main_login;

public class Main {
    
    public static void main(String [] args){
        
        Conection_PostgresSQL connection = new Conection_PostgresSQL();
        connection.conectBD();
        
        main_login actionOPen = new main_login();
        actionOPen.setVisible(true);
        
    }
}
