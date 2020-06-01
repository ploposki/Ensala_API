package br.edu.ensala.controller;

import br.edu.ensala.dao.CancelDAO;
import br.edu.ensala.request.CancelRequest;
import br.edu.ensala.response.CancelResponse;

public class CancelController {
    
    public CancelResponse cancel(CancelRequest cancelRequest){
        
        CancelResponse cancelResponse = new CancelResponse();
        
        try{
            
            cancelResponse = CancelDAO.cancel(cancelRequest);
            
        }
        catch(Exception e){
            
            System.out.println(e);
            
        }
        
        return cancelResponse;
        
    }
    
}
