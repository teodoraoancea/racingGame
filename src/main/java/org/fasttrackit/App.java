package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args)
    {
        //this is one-line cmment
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;

        Car car =  new Car(engine);
        car.name = "Dacia";
        car.fuelLevel = 60;
        car.mileage = 8.5;
        car.doorCount = 5;
        car.maxSpeed = 180;
        car.fuelType = "Gasoline";


        System.out.println(car.name);
        System.out.println(car.traveledDistance);
        System.out.println(car.running);

        car.accelerate(60,1);

        Engine engine2 = new Engine();
        engine2.manufacturer = "VW";
        engine2.capacity = 1600;

        Car car2 = new Car(engine2);
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

