package com.project.dinein.model;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name="dish")
public class Dish {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="dish_id")
    private int dishId;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

//    @Column(name="image")
//    private Blob image;

    @Column(name="price")
    private int price;

    @Column(name="dish_type")
    private String type;

    public Dish() {

    }


    public Dish(int dishId, String name, String description, int price, String type) {
        this.dishId = dishId;
        this.name = name;
        this.description = description;
//        this.image = image;
        this.price = price;
        this.type = type;
    }

    public int getDishId() {
        return dishId;
    }

    public String getName() {
        return name;
    }

//    public Blob getImage() {
//        return image;
//    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

}
