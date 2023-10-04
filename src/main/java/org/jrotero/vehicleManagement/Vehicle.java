package org.jrotero.vehicleManagement;

public abstract class Vehicle {
    String color;
    double price;
    int contructionYear;

    public Vehicle(String color, double price, int constructionYear) {
        this.color = color;
        this.price = price;
        this.contructionYear = constructionYear;
    }

    public void buyVehicle() {
        System.out.println("El precio del vehículo a comprar es: " + price + price * 0.22);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getConstructionYear() {
        return contructionYear;
    }

    public void setAnoDeConstruccion(int constructionYear) {
        this.contructionYear = constructionYear;
    }

    @Override
    public String toString() {
        return "Vehicle [color=" + color + ", price=" + price + ", contructionYear=" + contructionYear + "]";
    }

}
