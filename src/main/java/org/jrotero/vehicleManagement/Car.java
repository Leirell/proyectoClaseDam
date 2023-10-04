package org.jrotero.vehicleManagement;

public class Car extends Vehicle {
    double carTank;

    public Car(String color, double price, int constructionYear, double carTank) {
        super(color, price, constructionYear);
        this.carTank = carTank;
        // TODO Auto-generated constructor stub
    }

    public void buyVehicle() {
        System.out.println(
                "El precio del vehículo a comprar es: " + (price + price * 0.12) + " con un 12 % de impuestos");
    }

    public void rechargeCar(int rechargeTimeInMinutes) {
        System.out.println("Se ha rellenado: " + (rechargeTimeInMinutes * 60 * 2) + " voltios de la bateria");
        carTank += (rechargeTimeInMinutes * 60 * 2);
    }

    public void rechargeCar(double gasolineAmount) {
        System.out.println("Se ha rellenado: " + gasolineAmount + " litros de gasolina");
        carTank += gasolineAmount;
    }

    public double getCarTank() {
        return carTank;
    }

    public void setCarTank(double carTank) {
        this.carTank = carTank;
    }

    @Override
    public String toString() {
        return "Car [carTank=" + carTank + ", color=" + color + ", price=" + price + ", contructionYear="
                + contructionYear + "]";
    }

}
