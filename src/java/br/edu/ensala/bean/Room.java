package br.edu.ensala.bean;

public class Room {
    
    private String reserve_date;
    private int id_room;
    private int id_user;

    public Room() {
    }

    public Room(String reserve_date, int id_room, int id_user) {
        this.reserve_date = reserve_date;
        this.id_room = id_room;
        this.id_user = id_user;
    }

    public String getReserve_date() {
        return reserve_date;
    }

    public void setReserve_date(String reserve_date) {
        this.reserve_date = reserve_date;
    }

    public int getId_room() {
        return id_room;
    }

    public void setId_room(int id_room) {
        this.id_room = id_room;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

}
