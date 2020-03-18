package br.edu.ensala.controller;

import br.edu.ensala.dao.RegisterDAO;
import br.edu.ensala.request.RegisterRequest;
import br.edu.ensala.response.RegisterResponse;

public class RegisterController {
    
    public RegisterResponse register(RegisterRequest registerRequest){
        
        RegisterResponse registerResponse = new RegisterResponse();
        
        try{
            
            registerResponse = RegisterDAO.verifyUser(registerRequest);
            
        }
        catch(Exception e){
            
            System.out.println(e);
            
        }
        
        return registerResponse;
        
    }
    
}
