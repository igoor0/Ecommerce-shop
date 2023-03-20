package com.igorkohsin.backend.service;

import com.igorkohsin.backend.model.review.Review;
import com.igorkohsin.backend.webflow.request.CreateorUpdateReviewRequest;

import java.util.List;

public interface ReviewService {
    public void createOrUpdateReview(CreateorUpdateReviewRequest createOrUpdateReviewRequest);

    public List<Review> getReviewsForProduct(String productId);
}
