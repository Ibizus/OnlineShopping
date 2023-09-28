package org.iesvdm.utils;

public class Supplier {

    // ATTRIBUTES:
    private String name;
    private Address address;
    private Phone contactPhone;

    // CONSTRUCTOR:
    public Supplier(String name, Address address, Phone contactPhone) {
        this.name = name;
        this.address = address;
        this.contactPhone = contactPhone;
    }

    // GETTERS & SETTERS:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Phone getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(Phone contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Override
    public String toString() {
        return "Supplier: " + name + "\nAddress: " + address + "\nContact Phone: " + contactPhone;
    }
}
