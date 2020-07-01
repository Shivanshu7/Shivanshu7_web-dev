package com.web.service;

import com.springrest.entity.Customer;

import java.util.List;

public interface ICustomer {
    List<Customer> GetAllCustomer();
    Customer FindCustomer(int cid);
    Customer Create(Customer objCustomer);
    Customer update(int cid, Vehicle objCustomer);
    void Delete(int cid);
   

}

