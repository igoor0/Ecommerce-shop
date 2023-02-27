package com.igorkohsin.backend.model.order;

import com.igorkohsin.backend.model.product.Product;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("order")
public class Order {
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
}
