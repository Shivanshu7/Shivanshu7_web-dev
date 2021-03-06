package com.web.service;

import com.web.entity.Customer;
import com.web.exception.BadRequestException;
import com.web.exception.CustomerNotFoundException;
import com.web.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerImplementation implements ICustomer {

    @Autowired
    ICustomerRepository custRepo;

    public CustomerImplementation(ICustomerRepository custRepo) {
        this.custRepo = custRepo;

    }

    @Override
    @Transactional (readOnly = true)
    public List<Customer> GetAllCustomer() {
        return (List<Customer>) custRepo.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Customer FindCustomer(int cid) {
        // optional is a wrapper on top of vehicle object
        Optional<Customer> v1 = custRepo.findById(cid);
        if(!v1.isPresent ())
        {
            throw new CustomerNotFoundException ("Customer with id :" + cid +" not found");
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
    public Customer Create(Customer objCustomer) {
        Customer v1 = custRepo.save ( objCustomer );
        if(v1 == null)
        {
            throw new BadRequestException ("Customer  not created successfully:" + objCustomer.getname () +" not found");
        }
        return v1;
    }

    @Override
    @Transactional // Have the benefit of applying to whatever layer you want to
    //Syncronized -- one thread at a time but trans gives rollback features
    public Customer update(int cid, Customer objCustomer) {
        Optional<Customer> v1 = custRepo.findById(cid);
        if(!v1.isPresent ())
        {
            throw new CustomerNotFoundException ("Customer with id :" + cid +" not found");
        }
        return   custRepo.save( objCustomer);
        //  return  null;
    }

    @Override
    @Transactional
    public void Delete(int cid) {
        Optional<Customer> v1 = custRepo.findById(cid);
        if(!v1.isPresent ())
        {
            throw new CustomerNotFoundException ("Customer with id :" + cid +" not found");
        }
        custRepo.delete ( v1.get () );
    }
}
