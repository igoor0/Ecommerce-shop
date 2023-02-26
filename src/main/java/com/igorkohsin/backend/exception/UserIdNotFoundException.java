package com.igorkohsin.backend.exception;

public class UserIdNotFoundException extends RuntimeException {
    public UserIdNotFoundException(String id) {
        super("Could not find user with the id: " + id);
    }
}
