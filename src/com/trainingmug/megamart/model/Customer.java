package com.trainingmug.megamart.model;

public class Customer {


    /*
    Create the following properties
    --------------------------------------------------------------
    Access Modifier           Data Type             variable
    ---------------------------------------------------------------
    private                     int                   id
    private                     String                name
    private
     */


    /*
    Create a no-arg constructor
     */


    /*
    create an argument constructor
     */

    /*
    create getters and setters methods
     */

    /*
    override toString method
     */

    /*
    create the following method to display the customer details
     */
    private int id;
    private String name;
    private String email;
    private String contactNo;

    public Customer(int id, String name, String email, String contactNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contactNo = contactNo;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void displayDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Email: " + email);
        System.out.println("Contact No : " + contactNo);
    }



    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contactNo='" + contactNo + '\'' +

                '}';
    }
}
