package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args)
    {

        //this is one-line cmment
        Car car =  new Car();
        car.name = "Dacia";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 5;
        car.maxSpeed = 180;
        car.fuelType = "Gasoline";

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;

        car.engine = engine

        System.out.println(car.name);
        System.out.println(car.traveledDistance);
        System.out.println(car.running);

        Car car2 = new Car();
        car2.name = "Golf";
        car2.fuelLevel = 70;
        car2.mileage = 9.5;
        car2.doorCount = 3;
        car2.maxSpeed = 4;
        car2.fuelType = "Gasoline";



        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car2 name: " + car.name);



    }
}

