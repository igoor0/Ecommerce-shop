package com.igorkohsin.backend.repository;

import com.igorkohsin.backend.model.token.Token;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TokenRepository extends MongoRepository<Token, String> {
    @Query("{ 'user.id' : ?0, $or : [ { 'expired' : false }, { 'revoked' : false } ] }")
    List<Token> findAllValidTokenByUser(String id);

    Optional<Token> findByToken(String token);
}

