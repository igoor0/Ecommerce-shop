package com.igorkohsin.backend.model;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("user")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String addressStreet;
    private String adressCity;
    private String addressNumber;
    private String zipCode;
    private String email;
    private String phoneNumber;
    private String password;
    @Field(name = "enabled")
    private boolean isEnabled;
    @Field(name = "expired")
    private boolean isExpired;
    @Field(name = "role")
    private USER_ROLE userRole = USER_ROLE.USER;
    public User() {}
    public User(String id, String firstName, String lastName, String email, String password, boolean isEnabled, boolean isExpired, USER_ROLE userRoles) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isEnabled = isEnabled;
        this.isExpired = isExpired;
        this.userRole = USER_ROLE.USER;
    }

    public USER_ROLE getUserRole() {
        return userRole;
    }

    public void setUserRole(USER_ROLE userRole) {
        this.userRole = userRole;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}
