package com.company;

import java.util.Random;

public class RandomCreate implements AnimalCreate{
    AnimalCreate[] factories;
    Random r = new Random();

    public RandomCreate(AnimalCreate[] factories){
        this.factories = factories;
    }

    @Override
    public Animal create() {
        int ind  = (r.nextInt(3)+1);
        return factories[ind].create();
    }

}
