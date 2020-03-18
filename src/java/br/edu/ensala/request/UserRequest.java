package br.edu.ensala.request;

import br.edu.ensala.bean.User;

public class UserRequest {
    
    private User user;

    public UserRequest() {
    }
    
    public UserRequest(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
