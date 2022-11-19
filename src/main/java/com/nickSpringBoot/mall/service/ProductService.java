package com.nickSpringBoot.mall.service;

import com.nickSpringBoot.mall.dto.ProductRequest;
import com.nickSpringBoot.mall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
