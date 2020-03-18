package br.edu.ensala.restful;

import br.edu.ensala.controller.RegisterController;
import br.edu.ensala.request.RegisterRequest;
import br.edu.ensala.response.RegisterResponse;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("register")
public class RegisterAPI {

    @Context
    private UriInfo context;
    
    public RegisterAPI() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response register(String user) throws IOException {
        
        RegisterController registerController = new RegisterController();
        RegisterRequest registerRequest = Json.toObject(user, RegisterRequest.class);
        RegisterResponse registerResponse = registerController.register(registerRequest);
        
        return Response.ok(Json.toJson(registerResponse)).build();
        
    }

}