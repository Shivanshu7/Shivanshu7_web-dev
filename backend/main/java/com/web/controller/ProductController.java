package com.web.controller;

import com.web.entity.Product;
import com.web.service.ProductImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "product")
public class ProductController {

    @Autowired
    private ProductImplementation productService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Product> GetAllProduct(){
        return productService.GetAllProduct ();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{pid}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Product FindProduct(@PathVariable("pid") int pid)
    {
        return productService.FindProduct ( pid);
    }

    @RequestMapping(method = RequestMethod.POST, consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Product Create(@RequestBody Product objProduct)
    {
        return productService.Create ( objProduct );
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{pid}", consumes =MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Product update(@PathVariable("pid") int pid ,@RequestBody Product objProduct)
    {
        return productService.update ( pid,objProduct );
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "{pid}")
    public void Delete(@PathVariable("pid") int pid)
    {
        productService.Delete ( pid );

    }



}

