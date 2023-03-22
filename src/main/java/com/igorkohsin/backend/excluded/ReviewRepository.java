package com.igorkohsin.backend.excluded;

import com.igorkohsin.backend.model.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {

    Optional<Review> findByUserIdAndProductId(String userId, String productId);

    Optional<List<Review>> findAllByProductId(String productId);

    //    long countAllByProductIdAndReviewMessageNotNull (String productId);
    long countAllByProductId(String productId);
}
