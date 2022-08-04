package com.project.dinein.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="customer")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cust_id")
    private int id;

    @Column(name="cust_name")
    private String name;

    @Column(name="cust_email")
    private String custEmail;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person() { }

    public Person(String name, String custEmail) {
        this.name = name;
        this.custEmail = custEmail;
    }

    public Person(@JsonProperty("id") int id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }



}
