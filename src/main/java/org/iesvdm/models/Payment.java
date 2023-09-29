package org.iesvdm.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Payment {

    // ATTRIBUTES:
    private String id;
    static private String idCount;
    private LocalDateTime paid;
    private BigDecimal total;
    private String details;
    private Account account;
    private Order order;


    // CONSTRUCTOR:
    public Payment(String details, Account account, Order order) {
        this.id = idCount+1;
        this.paid = LocalDateTime.now();
        this.details = details;
        this.account = account;
        this.order = order;
        this.total = order.getTotal();
    }


    // GETTERS: (Fields in Payment are set in the constructor, they cannot be edited)
    public String getId() {
        return id;
    }

    public LocalDateTime getPaid() {
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
