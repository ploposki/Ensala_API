package br.edu.ensala.restful;

import br.edu.ensala.controller.UserController;
import br.edu.ensala.request.UserRequest;
import br.edu.ensala.response.UserResponse;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("user")
public class UserAPI {

    @Context
    private UriInfo context;
    
    public UserAPI() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(String user) throws IOException {
        
        UserController userController = new UserController();
        UserRequest userRequest = Json.toObject(user, UserRequest.class);
        UserResponse userResponse = userController.login(userRequest);
        
        return Response.ok(Json.toJson(userResponse)).build();
        
    }

}
