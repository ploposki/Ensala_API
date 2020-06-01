package br.edu.ensala.dao;

import br.edu.ensala.bean.User;
import br.edu.ensala.conn.Conn;
import br.edu.ensala.request.RegisterRequest;
import br.edu.ensala.response.RegisterResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterDAO {
    
    public static RegisterResponse verifyUser(RegisterRequest registerRequest) {
        
        RegisterResponse registerResponse = new RegisterResponse();
        User user = new User();
        
        Connection conn = Conn.getConexao();
        
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        try {
            
            stmt = conn.prepareStatement("select * from user where binary name = ?");
            
            stmt.setString(1,registerRequest.getUser().getName());
            
            rs = stmt.executeQuery();
            
            int test = 0;

            while(rs.next()){
                
                test++;
                        
            }
            
            registerResponse.setUser(user);
            
            if(test < 1){
                
                registerUser(registerRequest.getUser().getName(),
                             registerRequest.getUser().getPassword(),
                             registerRequest.getUser().getAdmin_access());
                
                user.setId_user(test);
                user.setName(registerRequest.getUser().getName());
                user.setPassword(registerRequest.getUser().getPassword());
                user.setAdmin_access(registerRequest.getUser().getAdmin_access());
                
                registerResponse.setResponse(true);
            
            }
            else{
                
                registerResponse.setResponse(false);
                
            }
            
        }
        catch (SQLException ex) {
            
            System.out.println(ex);
            
        }
        finally{
            
            Conn.closeConexao(conn,stmt,rs);
            
        }
        
        return registerResponse;
        
    }
    
    public static void registerUser(String name, String password, int admin_access){
        
        Connection conn = Conn.getConexao();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conn.prepareStatement("insert into user (name, password, admin_access) values (?,?,?)");
            
            stmt.setString(1,name);
            stmt.setString(2,password);
            stmt.setInt(3,admin_access);
            
            stmt.executeUpdate();
            
        }
        catch (SQLException ex) {
            
            System.out.println(ex);
            
        }
        finally{
            
            Conn.closeConexao(conn,stmt);
            
        } 
        
    }
    
}
