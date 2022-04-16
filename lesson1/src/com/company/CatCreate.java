package com.company;

public class CatCreate implements AnimalCreate {
    @Override
    public Animal create() {
        return new Cat();
    }
}
