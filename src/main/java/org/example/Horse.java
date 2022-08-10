package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Horse implements Animal {
    @Value("${horseName}")
    private String horseName;
    @Value("${horseBreed}")
    private String horseBreed;
    @Value("${horseColor}")
    private String horseColor;

    public Horse() {
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getHorseBreed() {
        return horseBreed;
    }

    public void setHorseBreed(String horseBreed) {
        this.horseBreed = horseBreed;
    }

    public String getHorseColor() {
        return horseColor;
    }

    public void setHorseColor(String horseColor) {
        this.horseColor = horseColor;
    }

    @Override
    public void animalPlus() {
        System.out.println("Horse ++++");
    }

    @Override
    public void animalMinus() {
        System.out.println("Horse ------");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseName='" + horseName + '\'' +
                ", horseBreed='" + horseBreed + '\'' +
                ", horseColor='" + horseColor + '\'' +
                '}';
    }
}
