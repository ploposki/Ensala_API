package br.edu.ensala.request;

import br.edu.ensala.bean.User;

public class RegisterRequest {
    
    private User user;

    public RegisterRequest() {
    }
    
    public RegisterRequest(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
