package com.igorkohsin.backend.model.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("reviews")
public class Review {
    @MongoId
    @Field("id")
    private String reviewId;
    @Field("author")
    private String reviewAuthor;
    @Field("message")
    private String reviewMessage;
    @Field("rating")
    private String reviewRating;
    @Field("date")
    private LocalDate reviewDate;
}
