package com.trainingmug.megamart.service;

import com.trainingmug.megamart.model.Customer;
import com.trainingmug.megamart.model.Product;

public class CustomerServiceImpl implements CustomerService{

    ProductService productService;

    public CustomerServiceImpl(ProductService productService){
        this.productService = productService;
    }

    @Override
    public Product buyProduct(Product product) {
        System.out.println("Successfully purchased the product");
        productService.displayProductDetails(product);
        return product;
    }

    @Override
    public void displayCustomerDetails(Customer customer) {
        customer.displayDetails();
    }


}
