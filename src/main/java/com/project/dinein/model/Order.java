package com.project.dinein.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="order_s")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int orderid;

    @Column(name="cust_id")
    private int custId;

    @Column(name="order_amt")
    private double orderAmt;

    public Order() { }

    public Order(int orderid, int custId, double orderAmt) {
        this.orderid = orderid;
        this.custId = custId;
        this.orderAmt = orderAmt;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public double getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(double orderAmt) {
        this.orderAmt = orderAmt;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", custId=" + custId +
                ", orderAmt=" + orderAmt +
                '}';
    }
}
