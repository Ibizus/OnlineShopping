package org.iesvdm.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Price {

    // ATTRIBUTES:
    private BigDecimal amount;
    private String currency;

    // CONSTRUCTOR:
    public Price(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // GETTERS & SETTERS:
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return amount.setScale(2, RoundingMode.HALF_UP) + " " + currency;
    }
}
