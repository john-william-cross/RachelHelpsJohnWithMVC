package com.johncross;

/*
created dog object, generate constructors and getters/setters
 */

public class Dog {
    String color;
    String breed;
    String name;
    int age;

    public Dog(String color, String breed, String name, int age) {
        this.color = color;
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
