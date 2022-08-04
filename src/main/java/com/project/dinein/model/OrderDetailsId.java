package com.project.dinein.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class OrderDetailsId implements Serializable {

    @Column(name="order_id")
    @Id
    private int orderId;

    @Column(name="dish_id")
    @Id
    private int dishId;

    public OrderDetailsId() { }

    public OrderDetailsId(int orderId, int dishId) {
        this.orderId = orderId;
        this.dishId = dishId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailsId that = (OrderDetailsId) o;
        return orderId == that.orderId && dishId == that.dishId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, dishId);
    }
}
