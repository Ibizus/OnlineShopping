package org.iesvdm.models;

import org.iesvdm.utils.Address;
import org.iesvdm.utils.Phone;

public class Customer {

    // ATTRIBUTES:
    private String id;
    private Address address;
    private Phone phone;
    private String email;
    private WebUser user;
    private Account account;

    // CONSTRUCTOR:
    public Customer(String id, Address address, Phone phone, String email) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // METHODS:
    public void linkCustomerToAccount(Account account){
        this.setAccount(account);
    }



    // GETTERS & SETTERS:
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public WebUser getUser() {
        return user;
    }

    public void setUser(WebUser user) {
        this.user = user;
    }

    public Account getAccount() {
        return account;
    }

    private void setAccount(Account account) {
        this.account = account;
    }
}
