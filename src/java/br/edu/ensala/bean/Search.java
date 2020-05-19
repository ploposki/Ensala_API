package br.edu.ensala.bean;

import java.util.ArrayList;

public class Search {
    
    private ArrayList rooms;
    private ArrayList reserves;
    private String limit;

    public Search() {
    }

    public Search(ArrayList rooms, ArrayList reserves, String limit) {
        this.rooms = rooms;
        this.reserves = reserves;
        this.limit = limit;
    }

    public ArrayList getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList rooms) {
        this.rooms = rooms;
    }

    public ArrayList getReserves() {
        return reserves;
    }

    public void setReserves(ArrayList reserves) {
        this.reserves = reserves;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }
    
}
