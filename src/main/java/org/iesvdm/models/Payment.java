package org.iesvdm.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {

    // ATTRIBUTES:
    private String id;
    private LocalDate paid;
    private BigDecimal total;
    private String details;
    private Account account;
    private Order order;

    // CONSTRUCTOR:

    public Payment(String id, LocalDate paid, BigDecimal total, String details, Account account, Order order) {
        this.id = id;
        this.paid = paid;
        this.total = total;
        this.details = details;
        this.account = account;
        this.order = order;
    }


    // METHODS:


    // GETTERS: (Fields in Payment are set in the constructor, they cannot be edited)
    public String getId() {
        return id;
    }

    public LocalDate getPaid() {
        return paid;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public String getDetails() {
        return details;
    }

    public Account getAccount() {
        return account;
    }

    public Order getOrder() {
        return order;
    }
}
