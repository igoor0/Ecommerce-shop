package com.igorkohsin.backend.model.user;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("user")
public class User {
    @Id
    @Field("id")
    private String userId;
    @Field("firstname")
    private String firstName;
    @Field("lastname")
    private String lastName;
    private String address;
    private String city;
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
}
