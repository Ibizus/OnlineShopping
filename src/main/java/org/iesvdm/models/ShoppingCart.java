package org.iesvdm.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;

public class ShoppingCart {

    // ATTRIBUTES:
    private LocalDate created;
    private WebUser user;
    private Account account;
    private LinkedHashSet<LineItem> lines;

    // CONSTRUCTOR:

    public ShoppingCart(LocalDate created, WebUser user, Account account) {
        this.created = created;
        this.user = user;
        this.account = account;
    }


    // METHODS:


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
