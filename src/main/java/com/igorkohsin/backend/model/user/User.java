package com.igorkohsin.backend.model.user;

import com.igorkohsin.backend.model.Country;
import com.igorkohsin.backend.model.role.Role;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {
    @MongoId
    @Field("id")
    private String id;
    private String username;
    //private String address;
    //private String city;
    //@Field("zipcode")
    //private String zipCode;
    @NotBlank
    @Email
    private String email;
    //@NotBlank
    //private String username = email;
    //@NotBlank
    //private String phoneNumber;
    private String password;
    //private Country country = Country.POLAND;
//    @Field(name = "enabled")
//    private boolean isEnabled;
//    @Field(name = "confirmed")
//    private boolean isConfirmed;
//    @Field(name = "expired")
//    private boolean isExpired;
    @Field(name = "role")
    @DBRef
    private Set<Role> roles = new HashSet<>();

    public User(String username, String email, String password) {
    }
}
