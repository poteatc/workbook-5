package com.pluralsight.vehicles;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle moped = new Moped("Red", 20, 2, 1);
        vehicles.add(moped);
//        moped.setColor("Red");
//        moped.setFuelCapacity(20);
//        moped.setCargoCapacity(2);
//        moped.setNumberOfPassengers(1);

        Vehicle car = new Car("Black", 80, 5, 5);
        vehicles.add(car);

//        car.setColor("Black");
//        car.setFuelCapacity(80);
//        car.setCargoCapacity(5);
//        car.setNumberOfPassengers(5);

        Vehicle semiTruck = new SemiTruck("White", 100, 50, 5);
        vehicles.add(semiTruck);

//        semiTruck.setColor("White");
//        semiTruck.setFuelCapacity(100);
//        semiTruck.setCargoCapacity(50);
//        semiTruck.setNumberOfPassengers(3);

        Vehicle hovercraft = new Hovercraft("Grey", 35, 3, 4);
        vehicles.add(hovercraft);

//        hovercraft.setColor("Grey");
//        hovercraft.setFuelCapacity(35);
//        hovercraft.setCargoCapacity(3);
//        hovercraft.setNumberOfPassengers(4);
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }

    }
}
