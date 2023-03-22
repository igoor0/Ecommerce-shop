package com.igorkohsin.backend.excluded;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Document("PRODUCT")
public class Product {

    @MongoId(FieldType.STRING)
    private String productId;

    @Field("PRODUCT_NAME")
    private String productName;

    @Field("PRODUCT_DESCRIPTION")
    private String description;

    private double price;

    @Field("PRODUCT_IMAGE_ID")
    private String imageId;

    @DBRef
    private ProductCategory productCategory;

    @Field("AVAILABLE_ITEM_COUNT")
    private int availableItemCount;

    public Product_category getProductCategory() {
        return productCategory.getProductCategoryName();
    }

    public static ProductResponse fromEntity(Product product) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper.convertValue(product, ProductResponse.class);
    }
}

