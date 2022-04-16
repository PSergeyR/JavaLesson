package com.company;

public class Tiger extends Animal {

    static int countTiger = 0;
    Tiger(){
        countTiger++;
    }
    @Override
    int GetCount(){
        return countTiger;
    }
    int swimDistance = 100;
    int runDistance = 700;

    @Override
    void Swim(int swim) {
        if (swim > swimDistance)
            System.out.println("Тигр должен проплыть " + swim + ", это на " + (swim - swimDistance) + " больше максималки");
        else System.out.println("Тигр плывет:" + swim);
    }

    @Override
    void Run(int run) {
        if (run > runDistance)
            System.out.println("Тигр должен пропробежать " + run + ", это на " + (run - runDistance) + " больше максималки");
        else System.out.println("Тигр бежит:" + run);
    }
}
