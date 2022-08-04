package com.project.dinein.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name="order_details")
@IdClass(OrderDetailsId.class)
public class OrderDetails implements Serializable {

    @Column(name="order_id")
    @Id
    private int orderId;

    @Column(name="dish_id")
    @Id
    private int dishId;

    @Column(name="dish_count")
    private int dishCount;

    @Column(name="is_split")
    private boolean isSplit;

    @Column(name="split_with")
    private String splitWith;

    public OrderDetails() {
    }

    public OrderDetails(int orderId, int dishId, int dishCount, boolean isSplit, String splitWith) {
        this.orderId = orderId;
        this.dishId = dishId;
        this.dishCount = dishCount;
        this.isSplit = isSplit;
        this.splitWith = splitWith;
    }

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public int getDishCount() {
        return dishCount;
    }

    public void setDishCount(int dishCount) {
        this.dishCount = dishCount;
    }

    public boolean isSplit() {
        return isSplit;
    }

    public void setSplit(boolean split) {
        isSplit = split;
    }

    public String getSplitWith() {
        return splitWith;
    }

    public void setSplitWith(String splitWith) {
        this.splitWith = splitWith;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "order_details{" +
                "orderId=" + orderId +
                ", dishId=" + dishId +
                ", dishCount=" + dishCount +
                ", isSplit=" + isSplit +
                ", splitWith='" + splitWith + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetails that = (OrderDetails) o;
        return orderId == that.orderId && dishId == that.dishId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, dishId);
    }
}
