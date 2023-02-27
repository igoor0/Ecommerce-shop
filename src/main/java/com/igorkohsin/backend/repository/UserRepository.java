package com.igorkohsin.backend.repository;

import com.igorkohsin.backend.model.user.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query("{'id': ?0}")
    Optional<User> getUserById(String id);
    @Query("{'email': ?0}")
    Optional<User> getUserByEmail(String email);
}
