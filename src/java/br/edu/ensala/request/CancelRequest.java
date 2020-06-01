package br.edu.ensala.request;

import br.edu.ensala.bean.Room;

public class CancelRequest {
    
    private Room room;

    public CancelRequest() {
    }

    public CancelRequest(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

}
