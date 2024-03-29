package com.igorkohsin.backend.excluded;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("orders")
public class Order {
    @MongoId
    @Field("id")
    private String orderId;
    @Field("product")
    private Product orderProduct;
    @Field("author")
    private String orderAuthor;
    @Field("address")
    private String orderAddress;
    @Field("date")
    private LocalDate orderDate;
    @Field("price")
    private double orderPrice;
    private double orderDiscount;
}
