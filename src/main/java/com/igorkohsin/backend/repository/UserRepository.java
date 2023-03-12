package com.igorkohsin.backend.repository;

import com.igorkohsin.backend.model.user.User;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.function.Function;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query("{'email': ?0}")
    Optional<User> findByEmail(String email);
}
