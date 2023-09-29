package org.iesvdm;

import org.iesvdm.models.Account;
import org.iesvdm.models.Customer;
import org.iesvdm.models.Online_Shopping;
import org.iesvdm.models.Product;
import org.iesvdm.utils.Address;
import org.iesvdm.utils.Phone;
import org.iesvdm.utils.Price;
import org.iesvdm.utils.Supplier;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class OnlineShoppingTest {

    /*
    Crea los siguientes tests:

    Crear varios Web User, Customer, Account.
    Crear varios Product.
    Añadir varios Product a ShoppingCart de Web User y Account existente.
    Crear un Order y Payment asociado a un ShoppingCart existente.
     */

    // FIRST CREATE THE NEW ONLINE SHOP:
    Online_Shopping coolmod = new Online_Shopping();

    @Test
    public void createNewCustomers(){

        // First create accounts to be added later to its customers:
        Account number1 = new Account("1");
        Account number2 = new Account("2");
        Account number3 = new Account("3");

        // Customers created:
        Customer customer1 = new Customer("1", new Address(), new Phone(), "person1@mail.com");
        Customer customer2 = new Customer("2", new Address(), new Phone(), "person2@mail.com");
        Customer customer3 = new Customer("3", new Address(), new Phone(), "person3@mail.com");

        // Link Account to Customer works in both ways:
        customer1.linkCustomerToAccount(number1);
        number2.linkCustomerToAccount(customer2);
        customer3.linkCustomerToAccount(number3);

        // Add Customers to the Shop
        coolmod.newCustomer(customer1);
        coolmod.newCustomer(customer2);
        coolmod.newCustomer(customer3);
    }

    @Test
    public void createNewProducts(){
        coolmod.addProductToShop(new Product("1", "PC Box", new Supplier("DELL"), new Price(new BigDecimal("45"), "EUR")));
        coolmod.addProductToShop(new Product("2", "Mother Board", new Supplier("MSI"), new Price(new BigDecimal("250.35"), "EUR")));
        coolmod.addProductToShop(new Product("3", "Ram Memory", new Supplier("CRUCIAL"), new Price(new BigDecimal("89.9"), "EUR")));
    }

    @Test
    public void prueba(){


    }

    @Test
    public void otraprueba(){


    }
}
