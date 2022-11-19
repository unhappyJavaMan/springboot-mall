package com.nickSpringBoot.mall.service.Impl;

import com.nickSpringBoot.mall.dao.ProductDao;
import com.nickSpringBoot.mall.dto.ProductRequest;
import com.nickSpringBoot.mall.model.Product;
import com.nickSpringBoot.mall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
