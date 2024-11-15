package com.trainingmug.megamart.model;

public class Laptop extends Product{

     private byte ramSize;
     private String operatingSystem;

    public Laptop(int id, String name, double price, byte ramSize, String operatingSystem) {
        super(id, name, price);
        this.ramSize = ramSize;
        this.operatingSystem = operatingSystem;
    }

    public float getRamSize() {
        return ramSize;
    }

    public void setRamSize(byte ramSize) {
        this.ramSize = ramSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Ram Size : " + ramSize);
        System.out.println("Operating System : " + operatingSystem);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ramSize=" + ramSize +
                ", operatingSystem='" + operatingSystem + '\'' +
                "} " + super.toString();
    }
}
