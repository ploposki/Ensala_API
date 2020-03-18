package br.edu.ensala.controller;

import br.edu.ensala.dao.RoomDAO;
import br.edu.ensala.request.RoomRequest;
import br.edu.ensala.response.RoomResponse;

public class RoomController {
    
    public RoomResponse login(RoomRequest roomRequest){
        
        RoomResponse roomResponse = new RoomResponse();
        
        try{
            
            roomResponse = RoomDAO.verifyRoom(roomRequest);
            
        }
        catch(Exception e){
            
            System.out.println(e);
            
        }
        
        return roomResponse;
        
    }
    
}
