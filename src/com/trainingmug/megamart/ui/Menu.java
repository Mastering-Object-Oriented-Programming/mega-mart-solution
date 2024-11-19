package com.trainingmug.megamart.ui;

public class Menu {



    /*
    This method is to display the header of Mega Mart
    should look like this
    --------------------------------------------------
                WELCOME TO MEGA-MART
    --------------------------------------------------
     */
    public static void displayHeader(){
        System.out.println("--------------------------------------------------");
        System.out.println("            WELCOME TO MEGA-MART                  ");
        System.out.println("--------------------------------------------------");

    }


    /*
    This method is to display the main menu of Mega Mart
    should look like this
    --------------------------------------------------
                WELCOME TO MEGA-MART
    --------------------------------------------------

    1. Display Customer Details
    2. Display RegularCustomer Details
    3. Display PremiumCustomer Details
    4. Browse Products
    5. Display Product Details
    6. Buy Product

    Please Enter Your Input (1-6):
     */

    public static void displayMainMenu(){
        displayHeader();
        System.out.println("1. Display Customer Details");
        System.out.println("2. Display RegularCustomer Details");
        System.out.println("3. Display PremiumCustomer Details");
        System.out.println("4. Browse Products");
        System.out.println("5. Display Products Details");
        System.out.println("6. Buy Product");
        System.out.println("Please Enter Your Input (1-6) : ");

    }


}
