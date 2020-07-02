package com.web.controller;

import com.web.entity.Customer;
import com.web.service.CustomerImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "customer")
public class CustomerController {

    @Autowired
    private CustomerImplementation customerService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Customer> GetAllCustomer(){
        return customerService.GetAllCustomer ();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{cid}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Customer FindCustomer(@PathVariable("cid") int cid)
    {
        return customerService.FindCustomer ( cid);
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Customer Create(@RequestBody Customer objCustomer)
    {
        return customerService.Create ( objCustomer );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{cid}", consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Customer update(@PathVariable("cid") int cid ,@RequestBody Customer objCustomer)
    {
        return customerService.update ( cid,objCustomer );
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{cid}")
    public void Delete(@PathVariable("cid") int cid)
    {
        customerService.Delete ( cid );

    }



}
