package org.jrotero.vehicleManagement;

public class Plane extends Vehicle {
    int passengers;
    boolean luxuryPlane;

    public Plane(String color, double price, int constructionYear, int passengers, boolean luxuryPlane) {
        super(color, price, constructionYear);
        this.passengers = passengers;
        this.luxuryPlane = luxuryPlane;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Plane [passengers=" + passengers + ", luxuryPlane=" + luxuryPlane + ", color=" + color + ", price="
                + price + ", contructionYear=" + contructionYear + "]";
    }

}
