package br.edu.ensala.response;

import br.edu.ensala.bean.Room;

public class CancelResponse {
    
    private Room room;
    private boolean response;

    public CancelResponse() {
    }

    public CancelResponse(Room room, boolean response) {
        this.room = room;
        this.response = response;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }
    
}
