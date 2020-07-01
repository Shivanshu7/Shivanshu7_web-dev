package com.web.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.UUID;

@Entity
public class Order {



    @Id
    @Column(columnDefinition = "varchar(36)")
    private int cid;
    private int pid;
    private int quantity;

  

    public String getcid() {
        return cid;
    }

    public void setcid(int cid) {
        this.cid = cid;
    }

    public String getpid() {
        return pid;
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
