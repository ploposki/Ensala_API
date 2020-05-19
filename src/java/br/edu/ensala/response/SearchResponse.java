package br.edu.ensala.response;

import br.edu.ensala.bean.Search;

public class SearchResponse {
    
    private Search search;
    private boolean response;

    public SearchResponse() {
    }

    public SearchResponse(Search search, boolean response) {
        this.search = search;
        this.response = response;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }
}
