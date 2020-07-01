package com.web.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Customer {


    @Id
    @Column(columnDefinition = "varchar(36)")
    private int cid;
    private String name;
    private String address;
    private String email;
    private String phone;

    public Customer()
    {
        this.cid = UUID.randomUUID ().toString ();
    }
    public Customer(String name, String address, String email, String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }


    public int getcid() {
        return cid;
    }

   
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    
    public String getphone() {
        return phone;
    }

    public void setphone(String email) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer { name=" + name +
                ", address=" + address +
                ", email=" + email +
                ", phone=" + phone +
                '}';
    }
}

