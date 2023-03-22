package com.igorkohsin.backend.excluded;

import com.igorkohsin.backend.model.review.Review;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReviewService {
    public void createOrUpdateReview(CreateorUpdateReviewRequest createOrUpdateReviewRequest);

    public List<Review> getReviewsForProduct(String productId);
}
