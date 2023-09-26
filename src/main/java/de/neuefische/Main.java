package de.neuefische;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("VW", "Golf", "red", 90, 1995);
        car.startCar();
        car.accelerate(180);
        car.accelerate(50);

        System.out.println();
        System.out.println();

        Person max = new Person("Max", 25, 'm');
        max.introduce();
        Person lisa = new Person("Lisa", 23, 'f');
        lisa.introduce();
    }
}