package com.trainingmug.megamart;

import com.trainingmug.megamart.model.*;
import com.trainingmug.megamart.service.CustomerService;
import com.trainingmug.megamart.service.CustomerServiceImpl;
import com.trainingmug.megamart.service.ProductService;
import com.trainingmug.megamart.service.ProductServiceImpl;
import com.trainingmug.megamart.ui.Menu;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductService productService = new ProductServiceImpl();
        CustomerService customerService = new CustomerServiceImpl(productService);

        //Create some dummy Product objects using no arg constructor and set the properties using getters and setters methods
        Product product = new Product();
        product.setId(111);
        product.setName("Samsung Galaxy Phone");
        product.setPrice(23452);

        //Create a dummy Camera Object using argument constructor
        Camera camera = new Camera(222,"Sony L4",23423,32.5f,true);

        //create a dummy laptop object using argument constructor
        Laptop laptop = new Laptop(333,"Lenovo IdeaPad", 23423,(byte)32,"Windows");

        //Create some dummy Customer Objects using argument constructor
        Customer customer = new Customer(1111,"John Doe","johndoe@gmaill.com","2342323");

        //Create some dummy RegularCustomer Object using argument constructor
        RegularCustomer regularCustomer = new RegularCustomer(2222,"Steve","steve@gmail.com","32452323",12.5f);

        //create some dummy PremiumCustomer Object using argument constructor
        PremiumCustomer premiumCustomer = new PremiumCustomer(3333,"Vicky","vicky@gmail.com","23423432","Gold");


        Scanner scanner = new Scanner(System.in);
        Menu.displayMainMenu();
        System.out.println("Enter Your Input (1-6)");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                //Call the displayCustomerDetails to print  the customer details
                customerService.displayCustomerDetails(customer);
                break;
            case 2:
                //call the displayCustomerDetails to print the regular customer details
                customerService.displayCustomerDetails(regularCustomer);
                break;
            case 3:
                customerService.displayCustomerDetails(premiumCustomer);
                break;
            case 4:
                productService.displayAllProducts();
                break;
            case 5:
                productService.displayProductDetails(product);
                break;
            case 6:
                customerService.buyProduct(product);
                break;
            default:
                System.out.println("Invalid Input ..");

        }
    }
}
