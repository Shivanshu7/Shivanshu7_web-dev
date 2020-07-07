package com.web.entity;


import javax.persistence.*;
import java.util.UUID;

@Entity
public class Order {




    private int cid;
    private int pid;
    private int quantity;

    public Order(int cid, int pid, int quantity)
    {
        this.cid=cid;
        this.pid=pid;
        this.quantity=quantity;
    }


    public void setcid(int cid) {
        this.cid = cid;
    }



    public void setpid(int pid) {
        this.pid = pid;
    }

    public int getquantity() {
        return quantity;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "order{" +
                "cid='" + cid + '\'' +
                ", pid='" + pid + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
