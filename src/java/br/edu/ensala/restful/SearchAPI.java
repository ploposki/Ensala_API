package br.edu.ensala.restful;

import br.edu.ensala.controller.SearchController;
import br.edu.ensala.request.SearchRequest;
import br.edu.ensala.response.SearchResponse;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("search")
public class SearchAPI {

    @Context
    private UriInfo context;
    
    public SearchAPI() {
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response login(String search) throws IOException {
        
        SearchController searchController = new SearchController();
        SearchRequest searchRequest = Json.toObject(search, SearchRequest.class);
        SearchResponse searchResponse = searchController.search(searchRequest);
        
        return Response.ok(Json.toJson(searchResponse)).build();
        
    }

}
