package com.igorkohsin.backend.excluded;

import com.igorkohsin.backend.excluded.Product;
import com.igorkohsin.backend.excluded.CreateProductRequest;
import com.igorkohsin.backend.excluded.UpdateProductRequest;
import com.igorkohsin.backend.excluded.ProductResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;


public interface ProductService {

    String createProduct(@Valid CreateProductRequest createProductRequest);

    ProductResponse getProduct(String productId);

    void deleteProduct(String productId);

    void updateProduct(UpdateProductRequest updateProductRequest);

    Page<Product> findAllProducts(Pageable pageable);

    Page<ProductResponse> getAllProducts(String sort, Integer page, Integer size);
}
