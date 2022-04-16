package com.company;

public class Cat extends Animal {
    static int countCat = 0;
    Cat(){
        countCat++;
    }
    @Override
     int GetCount(){
        return countCat;
    }

    int runDistance = 200;

    @Override
    void Swim(int swim) {
        System.out.println("Кошку заставляют плыть: " + swim + ", но она не умеет и утонет!");

    }

    @Override
    void Run(int run) {
        if (run > runDistance)
            System.out.println("Кот должен пропробежать " + run + ", это на " + (run - runDistance) + " больше максималки");
        else System.out.println("Кот бежит:" + run);
    }
}
