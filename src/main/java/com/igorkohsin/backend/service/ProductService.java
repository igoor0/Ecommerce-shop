package com.igorkohsin.backend.service;

import com.igorkohsin.backend.model.product.Product;
import com.igorkohsin.backend.webflow.request.CreateProductRequest;
import com.igorkohsin.backend.webflow.request.UpdateProductRequest;
import com.igorkohsin.backend.webflow.response.ProductResponse;
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
