package br.edu.ensala.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conn {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/unicuritiba?autoReconnect=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConexao(){
        
        try {
            
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL,USER,PASS);
            
        }
        catch (ClassNotFoundException | SQLException ex){
            
            System.out.println(ex);

        }
        
        return null;
        
    }

    public static void closeConexao (Connection conn, PreparedStatement stmt){

        try {
            
            if(conn != null){
                
                conn.close();
                
            }
            else if(stmt != null){
                
                stmt.close();
                
            }
            
        }
        catch (SQLException ex) {
            
            System.out.println(ex);

        }
        
    }

    public static void closeConexao (Connection conn, PreparedStatement stmt, ResultSet rs){

        try {
            
            if(conn != null){
                
                conn.close();
                
            }
            else if(stmt != null){
                
                stmt.close();
                
            }
            else if(rs != null){
                
                rs.close();
                
            }
            
        }
        catch (SQLException ex) {
            
            System.out.println(ex);
            
        }
        
    }
    
}
