package de.neuefische;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int horsePower;
    public int yearOfConstruction;
    public int velocity;

    public Car(String brand, String model, String color, int horsePower, int yearOfConstruction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.yearOfConstruction = yearOfConstruction;
    }

    public void startCar(){
        System.out.println("The car is starting");
    }

    public void accelerate(int speed){
        velocity += speed;
        System.out.println("The car is accelerating to " + velocity + " km/h");
    }
}
