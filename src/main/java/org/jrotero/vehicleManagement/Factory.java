package org.jrotero.vehicleManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Factory {

    public static void main(String[] args) {

        Map<String, Vehicle> factoryInventary = new HashMap<String, Vehicle>();

        factoryInventary.put(giveId(), new ElectricCar(giveColor(), 6000, 2019, 20, true));
        factoryInventary.put(giveId(), new Ship(giveColor(), 4750, 1893, 10, 80));
        factoryInventary.put(giveId(), new Plane(giveColor(), 3000, 2012, 50, false));

        for (Map.Entry<String, Vehicle> product : factoryInventary.entrySet()) {
            System.out.println(product.getKey() + ": " + product.getValue());
            if (product.getValue() instanceof Car) {
                product.getValue().buyVehicle();
            }
            if (product.getValue() instanceof ElectricCar) {
                ((Car) product.getValue()).rechargeCar(50);
            }
            if (product.getValue() instanceof GasolineCar) {
                ((Car) product.getValue()).rechargeCar(25.5);
            }
            if (product.getValue() instanceof Ship) {
                product.getValue().buyVehicle();
            }
            System.out.println("*******************************");
        }
        Consumer<Integer> numberofPeople = integerValue -> System.out
                .println("El numero de empleados en la fábrica es:" + integerValue);
        numberofPeople.accept(5000);

        BiPredicate<Integer, Integer> checkId = (integerValue1, integerValue2) -> integerValue1 == integerValue2;

        boolean isEqual = checkId.test(2013, 2023);

        if (!isEqual) {
            System.out.println("No se está mirando la producción del año actual");
        }

    }

    public static String giveColor() {
        List<List<String>> colors = new ArrayList<>();

        List<String> row1 = Arrays.asList("Rojo", "Verde", "Azul");

        List<String> row2 = Arrays.asList("Blanco", "Marrón", "Rosa");

        List<String> row3 = Arrays.asList("Cyan", "Violeta", "Negro");

        colors.add(row1);
        colors.add(row2);
        colors.add(row3);

        Random random = new Random();
        int randomRow = random.nextInt(colors.size());
        int randomColorIndex = random.nextInt(colors.get(randomRow).size());
        return colors.get(randomRow).get(randomColorIndex);

    }

    public static String giveId() {
        // Se puede llamar a la libreria stringBuilder
        Supplier<Double> giveRandomNumber = Math::random;
        int number = (int) (giveRandomNumber.get() * 10000);

        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String id = String.valueOf(number);

        for (int i = 0; i < 3; i++) {
            char chosenLetter = abc.charAt((int) (26 * Math.random()));
            id = id.concat(String.valueOf(chosenLetter));
        }

        return id;
    }
}
