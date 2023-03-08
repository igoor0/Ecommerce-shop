package com.igorkohsin.backend.model.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("products")
public class Product {
    @MongoId
    @Field("id")
    private String productId;
    @Field("name")
    private String productName;
    @Field("sex")
    private Product_sex productSex;
    @Field("category")
    private Product_category productCategory;
    @Field("size")
    private Product_size productSize;
    @Field("quantity")
    private Integer productQuantity;
    @Field("img")
    private String productIMG;
    @Field("price")
    private double productPrice;
    @Field("available")
    private boolean productAvailable;
    private double productDiscount;
}