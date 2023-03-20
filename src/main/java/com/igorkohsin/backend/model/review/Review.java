package com.igorkohsin.backend.model.review;

import com.igorkohsin.backend.config.DateAudit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.cglib.core.Local;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Document("review")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review extends DateAudit {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "reviewid", updatable = false, nullable = false)
    private String reviewId;

    @Column(name = "productid", updatable = false, nullable = false)
    private String productId;

    @Column(name = "userid", nullable = false)
    private String userId;

    @Column(name = "username", nullable = false)
    private String userName;

    @Column(name = "ratingvalue", nullable = false)
    @Min(1)
    @Max(5)
    private double ratingValue;

    @Column(name = "reviewmessage")
    private String reviewMessage;

}
