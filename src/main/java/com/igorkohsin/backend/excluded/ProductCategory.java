package com.igorkohsin.backend.excluded;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Document("productCategories")
public class ProductCategory extends  {
    @MongoId(FieldType.STRING)
    private String id;
    private Product_category productCategoryName;
    private List<Product> products;
    private String description;
}
