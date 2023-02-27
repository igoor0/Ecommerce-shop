package com.igorkohsin.backend.model.user;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("user")
public class User {
    @MongoId
    @Field("id")
    private String userId;
    @Field("firstname")
    private String firstName;
    @Field("lastname")
    private String lastName;
    private String address;
    private String city;
    @Field("zipcode")
    private String zipCode;
    private String email;
    @Field("phonenumber")
    private String phoneNumber;
    private String password;
    @Field(name = "enabled")
    private boolean isEnabled;
    @Field(name = "confirmed")
    private boolean isConfirmed;
    @Field(name = "expired")
    private boolean isExpired;
    @Field(name = "role")
    private USER_ROLE userRole = USER_ROLE.USER;
}
