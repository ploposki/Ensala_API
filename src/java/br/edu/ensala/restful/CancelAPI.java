package br.edu.ensala.restful;

import br.edu.ensala.controller.CancelController;
import br.edu.ensala.request.CancelRequest;
import br.edu.ensala.response.CancelResponse;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("cancel")
public class CancelAPI {

    @Context
    private UriInfo context;
    
    public CancelAPI() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response cancel(String room) throws IOException {
        
        CancelController cancelController = new CancelController();
        CancelRequest cancelRequest = Json.toObject(room, CancelRequest.class);
        CancelResponse cancelResponse = cancelController.cancel(cancelRequest);
        
        return Response.ok(Json.toJson(cancelResponse)).build();
        
    }

}
