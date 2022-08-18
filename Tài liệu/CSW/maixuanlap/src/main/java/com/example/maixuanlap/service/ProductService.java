package com.example.maixuanlap.service;
import com.example.maixuanlap.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAllProducts();
    ProductEntity addProduct(ProductEntity productEntity);
    ProductEntity updateProduct(ProductEntity p);
}
