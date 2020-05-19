package br.edu.ensala.request;

import br.edu.ensala.bean.Search;

public class SearchRequest {
    
    private Search search;

    public SearchRequest() {
    }
    
    public SearchRequest(Search search) {
        this.search = search;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }
    
}
