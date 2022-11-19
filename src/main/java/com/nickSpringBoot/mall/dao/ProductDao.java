package com.nickSpringBoot.mall.dao;

import com.nickSpringBoot.mall.dto.ProductRequest;
import com.nickSpringBoot.mall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);

}
