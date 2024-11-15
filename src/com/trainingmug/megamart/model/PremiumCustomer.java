package com.trainingmug.megamart.model;

public class PremiumCustomer extends Customer{
    private String membership;

    public PremiumCustomer(int id, String name, String email, String contactNo, String membership) {
        super(id, name, email, contactNo);
        this.membership = membership;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Membership : " + membership);
    }

    @Override
    public String toString() {
        return "PremiumCustomer{" +
                "membership='" + membership + '\'' +
                "} " + super.toString();
    }
}
