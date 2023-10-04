package org.jrotero.vehicleManagement;

public class Ship extends Vehicle {
    int hardness;
    int passenger;

    public Ship(String color, double price, int constructionYear, int hardness, int passenger) {
        super(color, price, constructionYear);
        this.hardness = hardness;
        this.passenger = passenger;
        // TODO Auto-generated constructor stub
    }

    public void buyVehicle() {
        System.out
                .println("El precio del vehículo a comprar es: " + (price + price * 0.43) + " con un 43% de impuestos");
    }

    @Override
    public String toString() {
        return "Ship [hardness=" + hardness + ", passenger=" + passenger + ", color=" + color + ", price=" + price
                + ", contructionYear=" + contructionYear + "]";
    }

}
