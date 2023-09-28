package org.iesvdm.models;

public class LineItem {

    // ATTRIBUTES:
    private Product product;
    private Integer quantity;
    private Order order;
    private ShoppingCart cart;


    // CONSTRUCTOR:
    public LineItem(Product product, Integer quantity, Order order, ShoppingCart cart) {
        this.product = product;
        this.quantity = quantity;
        this.order = order;
        this.cart = cart;
    }


    // METHODS:


    // GETTERS & SETTERS:
    public Product getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Order getOrder() {
        return order;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
