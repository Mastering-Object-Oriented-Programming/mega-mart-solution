package com.trainingmug.megamart.service;

import com.trainingmug.megamart.model.Product;

public class ProductServiceImpl implements ProductService{

    @Override
    public void displayProductDetails(Product product) {
       product.displayDetails();
    }

    @Override
    public void displayAllProducts() {
        System.out.println("This method displays all the product details");
    }


}
