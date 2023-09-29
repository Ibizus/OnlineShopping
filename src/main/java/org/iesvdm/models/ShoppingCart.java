package org.iesvdm.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;

public class ShoppingCart {

    // ATTRIBUTES:
    private LocalDate created;
    private WebUser user;
    private Account account;
    private LinkedHashSet<LineItem> lines = new LinkedHashSet<>();

    // CONSTRUCTOR:
    public ShoppingCart() {
    }

    public ShoppingCart(LocalDate created, WebUser user, Account account) {
        this.created = created;
        this.user = user;
        this.account = account;
    }


    // METHODS:
    public void addToCart(Product product, Integer quantity){
        LineItem line = new LineItem(product, quantity, new Order(), this);

        this.lines.add(line);
    }
    
    public BigDecimal getTotal(){
        BigDecimal total = new BigDecimal("0");
        for (LineItem line : this.lines)
        {
            total = total.add(line.getProduct().getPrice().getAmount().multiply(new BigDecimal("" + line.getQuantity())));
        }
        return total;
    }

    // GETTERS & SETTERS:
    public void setLines(LinkedHashSet<LineItem> lines) {
        this.lines = lines;
    }

    public LocalDate getCreated() {
        return created;
    }

    public WebUser getUser() {
        return user;
    }

    public Account getAccount() {
        return account;
    }

    public LinkedHashSet<LineItem> getLines() {
        return lines;
    }
}
