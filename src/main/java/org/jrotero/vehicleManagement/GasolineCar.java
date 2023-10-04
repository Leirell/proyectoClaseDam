package org.jrotero.vehicleManagement;

public class GasolineCar extends Car {
    int horses;

    public GasolineCar(String color, double price, int constructionYear, double carTank, int horses) {
        super(color, price, constructionYear, carTank);
        this.horses = horses;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "GasolineCar [horses=" + horses + ", carTank=" + carTank + ", color=" + color + ", price=" + price
                + ", contructionYear=" + contructionYear + "]";
    }

}
