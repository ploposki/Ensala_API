package br.edu.ensala.bean;

public class Room {
    
    private String reserve_date;
    private String canceled_at;
    private int id_room;
    private int id_user;
    private int id_reserve;

    public Room() {
    }

    public Room(String reserve_date, String canceled_at, int id_room, int id_user, int id_reserve) {
        this.reserve_date = reserve_date;
        this.canceled_at = canceled_at;
        this.id_room = id_room;
        this.id_user = id_user;
        this.id_reserve = id_reserve;
    }

    public String getReserve_date() {
        return reserve_date;
    }

    public void setReserve_date(String reserve_date) {
        this.reserve_date = reserve_date;
    }

    public String getCanceled_at() {
        return canceled_at;
    }

    public void setCanceled_at(String canceled_at) {
        this.canceled_at = canceled_at;
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

    public int getId_reserve() {
        return id_reserve;
    }

    public void setId_reserve(int id_reserve) {
        this.id_reserve = id_reserve;
    }

}
