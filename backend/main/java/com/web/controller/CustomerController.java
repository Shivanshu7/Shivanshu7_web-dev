package com.web.controller;

import com.web.entity.Customer;
import com.web.service.CustomerImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "vehicles")
public class CustomerController {

    @Autowired
    private CustomerImplementation customerService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Customer> GetAllCustomer(){
        return customerService.GetAllCustomer ();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{vin}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Customer FindCustomer(@PathVariable("vin") int cid)
    {
        return customerService.FindCustomer ( cid);
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Customer Create(@RequestBody Customer objCustomer)
    {
        return customerService.Create ( objCustomer );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{vin}", consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Customer update(@PathVariable("vin") int cid ,@RequestBody Customer objCustomer)
    {
        return customerService.update ( strCustomerNumber,objCustomer );
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{vin}")
    public void Delete(@PathVariable("vin") int cid)
    {
        customerService.Delete ( cid );

    }



}
