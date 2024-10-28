package com.pluralsight.vehicles;

public class Program {
    public static void main(String[] args) {
        Moped moped = new Moped();
        moped.setColor("Red");
        moped.setFuelCapacity(20);
        moped.setCargoCapacity(2);
        moped.setNumberOfPassengers(1);

        Car car = new Car();
        car.setColor("Black");
        car.setFuelCapacity(80);
        car.setCargoCapacity(5);
        car.setNumberOfPassengers(5);

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setColor("White");
        semiTruck.setFuelCapacity(100);
        semiTruck.setCargoCapacity(50);
        semiTruck.setNumberOfPassengers(3);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("Grey");
        hovercraft.setFuelCapacity(35);
        hovercraft.setCargoCapacity(3);
        hovercraft.setNumberOfPassengers(4);
    }
}
