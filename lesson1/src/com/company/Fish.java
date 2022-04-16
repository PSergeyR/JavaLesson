package com.company;

public class Fish extends Animal {

    static int countFish = 0;
    Fish(){
        countFish++;
    }
    @Override
    int GetCount(){
        return countFish;
    }

    @Override
    void Run(int run) {
        System.out.println("Рыбу изверги заставляют бежать: " + run + ", но она не умеет");


    }

    @Override
    void Swim(int swim) {
        System.out.println("Рыба должна проплыть: " + swim + " , ей нравится");
    }

}
