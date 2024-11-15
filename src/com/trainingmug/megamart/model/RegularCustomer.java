package com.trainingmug.megamart.model;

public class RegularCustomer extends Customer{
    private float discountPercentage;


    public RegularCustomer(int id, String name, String email, String contactNo, float discountPercentage) {
        super(id, name, email, contactNo);
        this.discountPercentage = discountPercentage;
    }

    public float getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(float discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Discount Percentage : " + discountPercentage);
    }
    @Override
    public String toString() {
        return "RegularCustomer{" +
                "discountPercentage=" + discountPercentage +
                "} " + super.toString();
    }
}
