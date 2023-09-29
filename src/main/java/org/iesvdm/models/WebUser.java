package org.iesvdm.models;

import java.util.Objects;

enum UserState {New, Active, Blocked, Banned};
public class WebUser {

    // ATTRIBUTES:
    private String login_id;
    private String password;
    public UserState state;
    private Customer customer;
    private ShoppingCart cart;

    // CONSTRUCTOR:
    public WebUser(String id, String pass, Customer customer){
        this.login_id = id;
        this.password = pass;
        this.customer = customer;
        this.state = UserState.New;
        try {
            this.cart = customer.getAccount().getCart();
        }
        catch(Exception e) {
        }
    }


    // GETTERS & SETTERS:
    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public Customer getCustomer() {
        return customer;
    }

    private void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebUser webUser = (WebUser) o;
        return Objects.equals(login_id, webUser.login_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login_id);
    }
}
