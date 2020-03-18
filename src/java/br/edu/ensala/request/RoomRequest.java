package br.edu.ensala.request;

import br.edu.ensala.bean.Room;

public class RoomRequest {
    
    private Room room;

    public RoomRequest() {
    }

    public RoomRequest(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

}
