package com.igorkohsin.backend.repository;

import com.igorkohsin.backend.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends MongoRepository<User, String> {

}
