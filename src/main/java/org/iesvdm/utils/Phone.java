package org.iesvdm.utils;

public class Phone {

    // ATTRIBUTES:
    private String prefix;
    private String phoneNumber;

    // CONSTRUCTOR:
    public Phone(String prefix, String phoneNumber) {
        this.prefix = prefix;
        this.phoneNumber = phoneNumber;
    }

    // GETTERS & SETTERS:
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone Number: " + prefix + " " + phoneNumber;
    }
}
