package org.iesvdm.models;

import org.iesvdm.utils.Address;
import org.iesvdm.utils.Phone;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

public class Account {

    // ATTRIBUTES:
    private String id;
    private Address billing_address;
    private Boolean is_closed;
    private LocalDateTime open;
    private LocalDateTime closed;
    private Customer customer;
    private ShoppingCart cart = new ShoppingCart();
    private List<Payment> pays;
    private LinkedHashSet<Order> orders; // {ordered, unique}


    // CONSTRUCTOR:
    public Account(String id) {
        this.id = id;
        this.open = LocalDateTime.now();
    }

    public Account(String id, Address billing_address, Boolean is_closed, Customer customer) {
        this.id = id;
        this.billing_address = billing_address;
        this.is_closed = is_closed;
        this.open = LocalDateTime.now();
        this.customer = customer;
    }


    // METHODS:
    public void linkCustomerToAccount(Customer customer){
        this.setCustomer(customer);
    }



    // GETTERS & SETTERS:
    public String getId() {
        return id;
    }

    public Address getBilling_address() {
        return billing_address;
    }

    public Boolean getIs_closed() {
        return is_closed;
    }

    public LocalDateTime getOpen() {
        return open;
    }

    public LocalDateTime getClosed() {
        return closed;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public List<Payment> getPays() {
        return pays;
    }

    public LinkedHashSet<Order> getOrders() {
        return orders;
    }

    public void setBilling_address(Address billing_address) {
        this.billing_address = billing_address;
    }

    public void setIs_closed(Boolean is_closed) {
        this.is_closed = is_closed;
    }

    public void setClosed(LocalDateTime closed) {
        this.closed = closed;
    }

    public void setPays(List<Payment> pays) {
        this.pays = pays;
    }

    public void setOrders(LinkedHashSet<Order> orders) {
        this.orders = orders;
    }

    private void setCustomer(Customer customer) { this.customer = customer; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
