package com.bkravets;

import java.util.*;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car(2000, 2.4);
        Car car2 = new Car(2009, 1.5);
        Car car3 = new Car(2001, 3.6);
        Car car4 = new Car(1998, 1.6);

        List<Car> cars = new ArrayList<>(List.of(car1, car2, car3, car4));
        Collections.sort(cars);
        System.out.println(cars);

        Set<Car> sortedByEngine = new TreeSet<>(Comparator.comparingDouble(Car::getEngineCapacity));
        sortedByEngine.addAll(cars);
        System.out.println(sortedByEngine);
    }

}
