package br.edu.ensala.dao;

import br.edu.ensala.conn.Conn;
import br.edu.ensala.bean.User;
import br.edu.ensala.request.UserRequest;
import br.edu.ensala.response.UserResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    
    public static UserResponse verifyUser(UserRequest userRequest) {
        
        UserResponse userResponse = new UserResponse();
        User user = new User();
        
        Connection conn = Conn.getConexao();
        
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        try {
            
            stmt = conn.prepareStatement("select * from user where binary name = ? and binary password = ?");
            
            stmt.setString(1,userRequest.getUser().getName());
            stmt.setString(2,userRequest.getUser().getPassword());
            
            rs = stmt.executeQuery();
            
            int test = 0;

            while(rs.next()){
                
                user.setId_user(rs.getInt("id_user"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setAdmin_access(rs.getInt("admin_access"));
                
                test++;
                        
            }
            
            userResponse.setUser(user);
            
            if(test == 1){
                
                userResponse.setResponse(true);
            
            }
            else{
                
                userResponse.setResponse(false);
                
            }
            
        }
        catch (SQLException ex) {
            
            System.out.println(ex);
            
        }
        finally{
            
            Conn.closeConexao(conn,stmt,rs);
            
        }
        
        return userResponse;
        
    }
    
}
