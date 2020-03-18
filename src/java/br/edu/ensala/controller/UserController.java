package br.edu.ensala.controller;

import br.edu.ensala.dao.UserDAO;
import br.edu.ensala.request.UserRequest;
import br.edu.ensala.response.UserResponse;


public class UserController {
    
    public UserResponse login(UserRequest userRequest){
        
        UserResponse userResponse = new UserResponse();
        
        try{
            
            userResponse = UserDAO.verifyUser(userRequest);
            
        }
        catch(Exception e){
            
            System.out.println(e);
            
        }
        
        return userResponse;
        
    }
    
}
