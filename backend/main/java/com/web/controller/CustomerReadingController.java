package com.web.controller;


import com.web.entity.CustomerReading;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "customerreading")
public class CustomerReadingController {

    @RequestMapping(method = RequestMethod.GET)
    public List<CustomerReading> GetAllCistomer(){
        return null;
    }

    @RequestMapping(method = RequestMethod.GET, value = "{vin}")
    public CustomerReading FindCustomer(@PathVariable("vin") int cid)
    {
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public CustomerReading Create(@RequestBody CustomerReading objCustomer)
    {
        return null;
    }
    @RequestMapping(method = RequestMethod.PUT, value = "{id}")
    public CustomerReading update(@PathVariable("id") int cid, @RequestBody CustomerReading objCistomer)
    {
        return null;
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "{id}")
    public void Delete(@PathVariable("id") int cid)
    {

    }

}
