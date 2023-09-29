package org.iesvdm.models;

import org.iesvdm.utils.Address;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;

enum OrderStatus {New, Hold, Shipped, Delivered, Closed};

public class Order {

    // ATTRIBUTES:
    private String id;
    private LocalDateTime ordered;
    private LocalDateTime shipped;
    private Address ship_to;
    private OrderStatus status;
    private BigDecimal total;
    private Account account;
    private LinkedHashSet<Payment> payments = new LinkedHashSet<>();
    private LinkedHashSet<LineItem> lines = new LinkedHashSet<>();

    // CONSTRUCTOR:

    public Order() {
    }

    public Order(String id, Address ship_to, BigDecimal total, Account account) {
        this.id = id;
        this.ship_to = ship_to;
        this.total = total;
        this.account = account;
        this.ordered = LocalDateTime.now();
        this.status = OrderStatus.New;
    }

    // METHODS:
    public void sendOrder(){
        this.shipped = LocalDateTime.now();
    }


    // SETTERS:
    public void setOrdered(LocalDateTime ordered) {
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

    public LocalDateTime getOrdered() {
        return ordered;
    }

    public LocalDateTime getShipped() {
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