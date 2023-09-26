package de.neuefische;

public class Person {
    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("My name is " + name + " and I am " + age + " years old");
    }
}
