package com.company;

public class lesson1 {
    public static void main(String[] args) {
        System.out.println("Презентация 1, задание 1: таблица умножения");
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.print(j * i + "  ");
            }
            System.out.println("");
        }


        System.out.println("Презентация 1, задание 2: треугольник из цифр");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
    }
}
