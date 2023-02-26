package com.igorkohsin.backend.exception;

public class UserEmailNotFoundException extends RuntimeException {
    public UserEmailNotFoundException(String email) {
        super("Could not find user with the email: " + email);
    }
}
