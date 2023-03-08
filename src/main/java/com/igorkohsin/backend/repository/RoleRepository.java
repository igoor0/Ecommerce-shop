package com.igorkohsin.backend.repository;

import com.igorkohsin.backend.model.role.Roles;
import com.igorkohsin.backend.model.role.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(Roles name);



}
