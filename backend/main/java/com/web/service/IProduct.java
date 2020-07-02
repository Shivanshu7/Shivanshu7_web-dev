package com.web.service;

import com.springrest.entity.Product;

import java.util.List;

public interface IProduct {
    List<Product> GetAllProduct();
    Product FindProduct(int pid);
    Product Create(Product objProduct);
    Product update(int pid, Product objProduct);
    void Delete(int pid);
   

}

