package org.iesvdm;

import org.iesvdm.models.*;
import org.iesvdm.utils.Address;
import org.iesvdm.utils.Phone;
import org.iesvdm.utils.Price;
import org.iesvdm.utils.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class OnlineShoppingTest {

    // FIRST CREATE THE NEW ONLINE SHOP:
    Online_Shopping coolmod = new Online_Shopping();

    @Test
    public void createNewCustomersAccountsAndWebUsers(){

        // First create customers to be added later to its accounts:
        Customer customer1 = new Customer("1", new Address(), new Phone(), "person1@mail.com");
        Customer customer2 = new Customer("2", new Address(), new Phone(), "person2@mail.com");
        Customer customer3 = new Customer("3", new Address(), new Phone(), "person3@mail.com");

        // Accounts exists only if there is a customer first:
        Account number1 = new Account("1", new Address(), customer1);
        Account number2 = new Account("2", new Address(), customer2);
        Account number3 = new Account("3", new Address(), customer3);

        // Link Account to Customer (works in both ways):
        customer1.linkCustomerToAccount(number1);
        customer2.linkCustomerToAccount(number2);
        customer3.linkCustomerToAccount(number3);

        // Register web users:
        WebUser user1 = new WebUser("Paolo", "1111", customer1);
        WebUser user2 = new WebUser("Sandra", "2222", customer2);
        WebUser user3 = new WebUser("Daniel", "3333", customer3);

        // As a WebUser has always linked a Customer, I will add webUsers expecting that customers are also added:
        coolmod.newWebUser(user1);
        coolmod.newWebUser(user2);
        coolmod.newWebUser(user3);

        // Assess data entries:
        Assertions.assertEquals(3, coolmod.getCustomers().size());
        Assertions.assertEquals(3, coolmod.getWebUsers().size());

        // Assess data values:
        Assertions.assertEquals("person2@mail.com", customer2.getEmail());
        Assertions.assertEquals("person3@mail.com", number3.getCustomer().getEmail());
        Assertions.assertEquals("person1@mail.com", user1.getCustomer().getEmail());
    }

    @Test
    public void createNewProducts(){

        // Create products
        Product box = new Product("1", "PC Box", new Supplier("DELL"), new Price(new BigDecimal("45"), "EUR"));
        Product board = new Product("2", "Mother Board", new Supplier("MSI"), new Price(new BigDecimal("250.35"), "EUR"));
        Product memory = new Product("3", "Ram Memory", new Supplier("CRUCIAL"), new Price(new BigDecimal("89.9"), "EUR"));

        // Add products
        coolmod.addProductToShop(box);
        coolmod.addProductToShop(board);
        coolmod.addProductToShop(memory);

        // Assess data entry:
        Assertions.assertEquals(3, coolmod.getProducts().size());
        Assertions.assertTrue(coolmod.getProducts().contains(memory));

        // Assess data values:
        Assertions.assertEquals("Mother Board", board.getName());
        Assertions.assertEquals("DELL", box.getSupplier().getName());
        Assertions.assertEquals(new BigDecimal("89.9"), memory.getPrice().getAmount());
    }

    @Test
    public void addProductsToShoppingCartAndAccount(){

        // Create Customer Profile
        Customer customer1 = new Customer("1", new Address(), new Phone(), "person1@mail.com");
        Account number1 = new Account("1", new Address(), customer1);
        customer1.linkCustomerToAccount(number1);
        WebUser user1 = new WebUser("Paolo", "1111", customer1);
        coolmod.newWebUser(user1);
        // Create products
        Product box = new Product("1", "PC Box", new Supplier("DELL"), new Price(new BigDecimal("45"), "EUR"));
        coolmod.addProductToShop(box);

        // Add products from Webuser and Account:
        user1.getCart().addToCart(box, 2);
        number1.addToCart(box, 5);

        // Assess data entry:
        Assertions.assertEquals(2, user1.getCart().getLines().size());
        Assertions.assertEquals(2, number1.getCart().getLines().size());

        // Assess data values:
        Assertions.assertEquals("Optional[LineItem{" + "product=" + "Product{" +
                "id='" + box.getId() + ", name='" + box.getName() + '}'+ ", quantity=" + "2" + "}]",
                user1.getCart().getLines().stream().findFirst().toString());
    }

    @Test
    public void createOrderAndPaymentForExistingCart(){

        // Create Customer Profile
        Customer customer1 = new Customer("1", new Address(), new Phone(), "person1@mail.com");
        Account number1 = new Account("1", new Address(), customer1);
        customer1.linkCustomerToAccount(number1);
        WebUser user1 = new WebUser("Paolo", "1111", customer1);
        coolmod.newWebUser(user1);
        // Product
        Product box = new Product("1", "PC Box", new Supplier("DELL"), new Price(new BigDecimal("45"), "EUR"));
        coolmod.addProductToShop(box);
        // Add to cart
        user1.getCart().addToCart(box, 2);
        number1.addToCart(box, 5); // ----> 7 items added: 45x7= 315

        // Buy cart and create order and payment:
        customer1.getAccount().buyCart("first purchase");

        // Assess data entry:
        Assertions.assertEquals(1, customer1.getAccount().getOrders().size());
        Assertions.assertEquals(1, customer1.getAccount().getPays().size());

        // Assess data values:
        Assertions.assertEquals(new BigDecimal("315"), customer1.getAccount().getCart().getTotal());
    }
}
