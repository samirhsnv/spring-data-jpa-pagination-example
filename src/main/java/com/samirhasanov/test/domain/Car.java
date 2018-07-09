/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samirhasanov.test.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Hasanov (Asus)
 */
@Entity
@Table(name = "cars")
public class Car extends AbstractDomain {
    
    @Column
    private String make;
    
    @Column
    private String model;
    
    @Column
    private BigDecimal price;
    
    @Column
    private Integer year;
    
    @Column
    private String color;
    
    @Column
    private String body;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Car{super=" + super.toString() + ", make=" + make + ", model=" + model + ", price=" + price + ", year=" + year + ", color=" + color + ", body=" + body + '}';
    }
}
