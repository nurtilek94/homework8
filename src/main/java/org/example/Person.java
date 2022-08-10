package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {

    @Value("${personName}")
    private String personName;
    @Value("${personAge}")
    private String personAge;
    private Animal animal;

    @Autowired
    private Dog dog;


    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Autowired
    public Person(@Qualifier("horse") Animal animal) {
        this.animal = animal;
    }

    public Person() {
    }

    public void getAllMethodAnimal() {
        animal.animalMinus();
        dog.animalMinus();
    }

    @PostConstruct
    public void init() {
        System.out.println("init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy method");
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAge='" + personAge + '\'' +
                ", animal=" + animal +
                '}';
    }
}
