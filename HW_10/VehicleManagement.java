package edu.neu.mgen;

//Abstract class representing a vehicle
abstract class Vehicle {
    protected String make;
    protected String model;
    protected int speed;  

    public Vehicle(String make, String model, int speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }

    public abstract void move();
}

//Class representing a car that extends the Vehicle class
class Car extends Vehicle {
    public Car(String make, String model, int speed) {
        super(make, model, speed);
    }
    public void displayInfo() {
        super.displayInfo();
    }
    public void move() {
        System.out.println("The car is moving at " + speed + " mph.");
    }
}

//Class representing a motorbike that extends the Vehicle class
class Motorbike extends Vehicle {
    public Motorbike(String make, String model, int speed) {
        super(make, model, speed);
    }
     public void displayInfo() {
        super.displayInfo();
    }
    public void move() {
        System.out.println("The motorbike is moving at " + speed + " mph.");
    }
}

//Class representing an aircraft that extends the Vehicle class
class Aircraft extends Vehicle {
    public Aircraft(String make, String model, int speed) {
        super(make, model, speed);
    }
     public void displayInfo() {
        super.displayInfo();
    }
    public void move() {
        System.out.println("The aircraft is flying at " + speed + " mph.");
    }
}

//Class representing a ship that extends the Vehicle class
class Ship extends Vehicle {
    public Ship(String make, String model, int speed) {
        super(make, model, speed);
    }
     public void displayInfo() {
        super.displayInfo();
    }
    public void move() {
        System.out.println("The ship is sailing at " + speed + " mph.");
    }
}
public class VehicleManagement {
    public static void main(String[] args) {
        //Create an array of vehicles
        Vehicle[] vehicles = {
            new Car("Honda", "Civic", 120),
            new Motorbike("Harley-Davidson", "Street 750", 100),
            new Aircraft("Boeing", "747", 600),
            new Ship("Carnival", "Vista", 30)
        };

        //Display information and movement of each vehicle
        for (Vehicle vehicle : vehicles) {
            System.out.println("--------------------------------");
            vehicle.displayInfo();
            vehicle.move();
        }

        System.out.println("\n");

        //Answering the questions
        System.out.println("Which vehicle is the fastest?");
        System.out.println("Aircraft: " + vehicles[2].speed + " mph");

        System.out.println("\n");

        System.out.println("How long does it take for the ship to travel 500 miles?");
        System.out.println(500 / vehicles[3].speed + " hours");

    }

}
