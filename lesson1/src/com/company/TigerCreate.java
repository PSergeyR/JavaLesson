package com.company;

public class TigerCreate implements AnimalCreate {
    @Override
    public Animal create() {
        return new Tiger();
    }
}
