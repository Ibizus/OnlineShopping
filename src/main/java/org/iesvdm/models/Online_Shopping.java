package org.iesvdm.models;

import java.util.ArrayList;
import java.util.HashSet;

public class Online_Shopping {

    /*
    Crea los siguientes tests:

    Crear varios Web User, Customer, Account.
    Crear varios Product.
    Añadir varios Product a ShoppingCart de Web User y Account existente.
    Crear un Order y Payment asociado a un ShoppingCart existente.
     */

    // ATTRIBUTES:
    private HashSet<Customer> customers;
    private HashSet<WebUser> webUsers;
    private ArrayList<Product> products;

    // CONSTRUCTOR:
    public Online_Shopping() {
    }

    // METHODS:


    // GETTERS & SETTERS:
    public HashSet<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashSet<Customer> customers) {
        this.customers = customers;
    }

    public HashSet<WebUser> getWebUsers() {
        return webUsers;
    }

    public void setWebUsers(HashSet<WebUser> webUsers) {
        this.webUsers = webUsers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
