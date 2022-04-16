package com.company;



public class Dog extends Animal{

    static int countDog = 0;
    Dog(){
        countDog++;
    }
    @Override
    int GetCount(){
        return countDog;
    }
    int swimDistance = 10;
    int runDistance = 500;

    @Override
    void Swim(int swim) {

        if(swim > swimDistance)
        System.out.println("Собака должна проплыть " + swim +", это на " + (swim-swimDistance) + " больше максималки" );
        else System.out.println("Собака плывет:"+ swim);
    }

    @Override
    void Run(int run) {
        if(run > runDistance)
            System.out.println("Собака должна пропробежать " + run +", это на " + (run-runDistance) + " больше максималки" );
        else System.out.println("Собака бежит:"+ run);

    }
}
