package com.example.depository.entity;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: xiao
 * Date: 2020/9/4
 */
@Entity
@Table(name = "t_depository")
public class ShopDep {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String shopName;
    private Integer number;

    @Override
    public String toString() {
        return "ShopDep{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", number=" + number +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
