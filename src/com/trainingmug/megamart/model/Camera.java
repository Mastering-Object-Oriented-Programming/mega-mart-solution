package com.trainingmug.megamart.model;

public class Camera extends Product{

    private float cameraMegaPixels;
    private boolean isMirrorless;

    public Camera(int id, String name, double price, float cameraMegaPixels, boolean isMirrorless) {
        super(id, name, price);
        this.cameraMegaPixels = cameraMegaPixels;
        this.isMirrorless = isMirrorless;
    }

    public float getCameraMegaPixels() {
        return cameraMegaPixels;
    }

    public void setCameraMegaPixels(float cameraMegaPixels) {
        this.cameraMegaPixels = cameraMegaPixels;
    }

    public boolean isMirrorless() {
        return isMirrorless;
    }

    public void setMirrorless(boolean mirrorless) {
        isMirrorless = mirrorless;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Camera Mega Pixels : " + cameraMegaPixels);
        System.out.println("Is Mirror Less : " + isMirrorless);

    }

    @Override
    public String toString() {
        return "Camera{" +
                "cameraMegaPixels=" + cameraMegaPixels +
                ", isMirrorless=" + isMirrorless +
                "} " + super.toString();
    }
}
