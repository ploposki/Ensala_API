package br.edu.ensala.restful;

import br.edu.ensala.controller.RoomController;
import br.edu.ensala.request.RoomRequest;
import br.edu.ensala.response.RoomResponse;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("room")
public class RoomAPI {

    @Context
    private UriInfo context;
    
    public RoomAPI() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response room(String room) throws IOException {
        
        RoomController roomController = new RoomController();
        RoomRequest roomRequest = Json.toObject(room, RoomRequest.class);
        RoomResponse roomResponse = roomController.room(roomRequest);
        
        return Response.ok(Json.toJson(roomResponse)).build();
        
    }

}
