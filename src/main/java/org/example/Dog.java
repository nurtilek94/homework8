package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    @Value("${name}")
    private String name;
    @Value("${breed}")
    private String breed;
    @Value("${color}")
    private String color;

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void animalPlus() {
        System.out.println("Dog ++++");
    }

    @Override
    public void animalMinus() {
        System.out.println("Dog ----");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
