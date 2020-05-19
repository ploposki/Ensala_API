package br.edu.ensala.controller;

import br.edu.ensala.dao.SearchDAO;
import br.edu.ensala.request.SearchRequest;
import br.edu.ensala.response.SearchResponse;

public class SearchController {
    
    public SearchResponse search(SearchRequest searchRequest){
        
        SearchResponse searchResponse = new SearchResponse();
        
        try{
            
            searchResponse = SearchDAO.searchData(searchRequest);
            
        }
        catch(Exception e){
            
            System.out.println(e);
            
        }
        
        return searchResponse;
        
    }
    
}
