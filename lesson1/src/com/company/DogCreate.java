package com.company;

public class DogCreate implements AnimalCreate {
    @Override
    public Animal create() {
        return new Dog();
    }
}
