package org.jrotero.vehicleManagement;

public class ElectricCar extends Car {
    boolean automatic;

    public ElectricCar(String color, double price, int constructionYear, double carTank, boolean automatic) {
        super(color, price, constructionYear, carTank);
        // TODO Auto-generated constructor stub
        this.automatic = automatic;
    }

    @Override
    public String toString() {
        return "ElectricCar [automatic=" + automatic + ", carTank=" + carTank + ", color=" + color + ", price=" + price
                + ", contructionYear=" + contructionYear + "]";
    }

}
