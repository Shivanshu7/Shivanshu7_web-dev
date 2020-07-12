package com.web.repository;


import com.web.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product,Integer> {

    // Optional<Customer> findByid(int cid);

}