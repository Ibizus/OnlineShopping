package org.iesvdm.utils;

public class Address {

    // ATTRIBUTES:
    private String street;
    private String city;
    private String state;
    private String postalCode;

    // CONSTRUCTOR:

    public Address() {
    }

    public Address(String street, String city, String state, String postalCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    // GETTERS & SETTERS:
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    // Setters
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + postalCode;
    }

}
