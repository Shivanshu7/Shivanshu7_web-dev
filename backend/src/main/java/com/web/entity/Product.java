package com.web.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Product {

    @Id

    private int pid;
    private String name;
    private String type;
    private String barcode;
    private float price;




//    @OneToMany//(mappedBy="vehicleObj")
//    private List<VehicleReading> vehicleReadObj;

    public Product(int pid, String name, String type, String barcode, float price) {
        this.pid=pid;
        this.name = name;
        this.type = type;
        this.barcode = barcode;
        this.price = price;
    }


    public int getpid() {
        return pid;
    }

    public void setpid(int pid) {
        this.pid=pid;
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