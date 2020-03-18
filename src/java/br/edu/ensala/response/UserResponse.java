package br.edu.ensala.response;

import br.edu.ensala.bean.User;

public class UserResponse {
    
    private User user;
    private boolean response;

    public UserResponse() {
    }

    public UserResponse(User user, boolean response) {
        this.user = user;
        this.response = response;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }
}
