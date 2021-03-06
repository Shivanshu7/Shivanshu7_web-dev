package com.web.service;

import com.web.entity.Product;
import com.web.exception.BadRequestException;
import com.web.exception.ProductNotFoundException;
import com.web.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ProductImplementation implements IProduct {

    @Autowired
    IProductRepository proRepo;

    public ProductImplementation(IProductRepository proRepo) {
        this.proRepo = proRepo;

    }

    @Override
    @Transactional (readOnly = true)
    public List<Product> GetAllProduct() {
        return (List<Product>) proRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product FindProduct(int pid) {
        // optional is a wrapper on top of vehicle object
        Optional<Product> v1 = proRepo.findById(pid);
        if(!v1.isPresent ())
        {
            throw new ProductNotFoundException ("Product with id :" + pid +" not found");
        }
        return v1.get();
        // return  null;
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Vehicle FindVehicleName(String strVehicleName) {
//        //optional is a wrapper on top of vehicle object
//        Optional<Vehicle> v1 = vehiRepo.findByStrmake(strVehicleName);
//        if(!v1.isPresent ())
//        {
//            throw new VehicleNotFoundException ("Vehicle with id :" + strVehicleName +" not found");
//        }
//        return v1.get();
//    }


    @Override
    @Transactional
    public Product Create(Product objProduct) {
        Product v1 = proRepo.save ( objProduct );
        if(v1 == null)
        {
            throw new BadRequestException ("Product  not created successfully:" + objProduct.getname () +" not found");
        }
        return v1;
    }

    @Override
    @Transactional // Have the benefit of applying to whatever layer you want to
    //Syncronized -- one thread at a time but trans gives rollback features
    public Product update(int pid, Product objProduct) {
        Optional<Product> v1 = proRepo.findById(pid);
        if(!v1.isPresent ())
        {
            throw new ProductNotFoundException ("Product with id :" + pid +" not found");
        }
        return   proRepo.save( objProduct);
        //  return  null;
    }

    @Override
    @Transactional
    public void Delete(int pid) {
        Optional<Product> v1 = proRepo.findById(pid);
        if(!v1.isPresent ())
        {
            throw new ProductNotFoundException ("Product with id :" + pid +" not found");
        }
        proRepo.delete ( v1.get () );
    }
}
