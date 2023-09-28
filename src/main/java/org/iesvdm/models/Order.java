package org.iesvdm.models;

import org.iesvdm.utils.Address;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedHashSet;

enum OrderStatus {New, Hold, Shipped, Delivered, Closed};

public class Order {

    // ATTRIBUTES:
    private String id;
    private LocalDate ordered;
    private LocalDate shipped;
    private Address ship_to;
    private OrderStatus status;
    private BigDecimal total;
    private Account account;
    private LinkedHashSet<Payment> payments;
    private LinkedHashSet<LineItem> lines;

    // CONSTRUCTOR:

    public Order(String id, LocalDate ordered, Address ship_to, OrderStatus status, BigDecimal total, Account account) {
        this.id = id;
        this.ordered = ordered;
        this.ship_to = ship_to;
        this.status = status;
        this.total = total;
        this.account = account;
    }

    // METHODS:


    // SETTERS:
    public void setOrdered(LocalDate ordered) {
        this.ordered = ordered;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setPayments(LinkedHashSet<Payment> payments) {
        this.payments = payments;
    }

    public void setLines(LinkedHashSet<LineItem> lines) {
        this.lines = lines;
    }

    // GETTERS:
    public String getId() {
        return id;
    }

    public LocalDate getOrdered() {
        return ordered;
    }

    public LocalDate getShipped() {
        return shipped;
    }

    public Address getShip_to() {
        return ship_to;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public Account getAccount() {
        return account;
    }

    public LinkedHashSet<Payment> getPayments() {
        return payments;
    }

    public LinkedHashSet<LineItem> getLines() {
        return lines;
    }
}