package br.edu.ensala.bean;

public class User {

    private int id_user;
    private String name;
    private String password;
    private int admin_access;

    public User() {
    }

    public User(int id_user, String name, String password, int admin_access) {
        this.id_user = id_user;
        this.name = name;
        this.password = password;
        this.admin_access = admin_access;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAdmin_access() {
        return admin_access;
    }

    public void setAdmin_access(int admin_access) {
        this.admin_access = admin_access;
    }

}
