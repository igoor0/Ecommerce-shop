package com.igorkohsin.backend.model.product;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.awt.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("product")
public class Product {
    @MongoId
    @Field("id")
    private String productId;
    @Field("name")
    private String productName;
    @Field("sex")
    private PRODUCT_SEX productSex;
    @Field("category")
    private PRODUCT_CATEGORY productCategory;
    @Field("size")
    private PRODUCT_SIZE productSize;
    @Field("quantity")
    private Integer productQuantity;
    @Field("img")
    private String productIMG;
    @Field("price")
    private double productPrice;
    @Field("available")
    private boolean productAvailable;
}