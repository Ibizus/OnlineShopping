package org.iesvdm.models;

import java.util.ArrayList;
import java.util.HashSet;

public class Online_Shopping {

    // ATTRIBUTES:
    private HashSet<Customer> customers = new HashSet<>();
    private HashSet<WebUser> webUsers = new HashSet<>();
    private ArrayList<Product> products = new ArrayList<>();

    // CONSTRUCTOR:
    public Online_Shopping() {
    }

    // METHODS:
    public void addProductToShop(Product product){

        if(this.products.contains(product))
        {
            System.out.println("Product already listed in Shop");
        }
        else
        {
            this.products.add(product);
        }
    }

    public void newCustomer(Customer customer){

        this.customers.add(customer);
    }

    public void newWebUser(WebUser webUser){

        this.webUsers.add(webUser);
    }


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
