package com.web.entity;

import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
import java.util.UUID;

@Entity
public class Product {

    @Id
    @Column(columnDefinition = "varchar(36)")
    private int pid;
    private String name;
    private String type;
    private String Barcode;
    private float price;
    

    public Product() {
        this.pid = UUID.randomUUID ().toString ();
    }

//    @OneToMany//(mappedBy="vehicleObj")
//    private List<VehicleReading> vehicleReadObj;

    public int getpid() {
        return pid;
    }
    
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public String getbarcode() {
        return barcode;
    }

    public void setbarcode(String barcode) {
        this.barcode = barcode;
    }

    public float getprice() {
        return price;
    }

    public void setprice(float price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", barcode='" + barcode + '\'' +
                ", price=" + price +
                '}';
    }


}

