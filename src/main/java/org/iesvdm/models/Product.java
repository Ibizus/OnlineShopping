package org.iesvdm.models;

import org.iesvdm.utils.Price;
import org.iesvdm.utils.Supplier;

import java.util.Objects;

public class Product {

    // ATTRIBUTES:
    private String id;
    private String name;
    private Supplier supplier;
    private Price price;

    // CONSTRUCTOR:
    public Product(String id, String name, Supplier supplier, Price price) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
        this.price = price;
    }

    // METHODS:


    @Override
    public String toString() {
        return "Product{" + "id='" + id + ", name='" + name + '}';
    }

    // GETTERS & SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
