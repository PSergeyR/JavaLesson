package com.company;

public class FishCreate implements AnimalCreate {
    @Override
    public Animal create() {
        return new Fish();
    }
}
