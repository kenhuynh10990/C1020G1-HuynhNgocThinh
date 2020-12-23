package io_binary.bai_tap.product_manager;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String nameProduct;
    private String brand;
    private double cost;
    private String other;

    public Product() {
    }

    public Product(int id, String nameProduct, String brand, double cost, String other) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.brand = brand;
        this.cost = cost;
        this.other = other;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", brand='" + brand + '\'' +
                ", cost=" + cost +
                ", other='" + other + '\'' +
                '}';
    }
}
