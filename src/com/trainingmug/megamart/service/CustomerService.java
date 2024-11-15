package com.trainingmug.megamart.service;

import com.trainingmug.megamart.model.Customer;
import com.trainingmug.megamart.model.Product;

public interface CustomerService {

    public Product buyProduct(Product product);
    public void displayCustomerDetails(Customer customer);
}
