package com.web.repository;

import com.web.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer,String> {

  // Optional<Customer> findByid(int cid);

}