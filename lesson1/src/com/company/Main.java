package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //создаем экземпляры классов
        Animal dog = new Dog();
        Animal dog1 = new Dog();
        Animal cat = new Cat();
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal tiger = new Tiger();
        Animal fish = new Fish();
        Animal fish1 = new Fish();
        Animal fish2 = new Fish();
        Animal fish3 = new Fish();
        //Создаем массив
        Animal array[] = new Animal[10];
        //Складываем всех животных в массив
        array[0] = dog;
        array[1] = dog1;
        array[2] = cat;
        array[3] = cat1;
        array[4] = cat2;
        array[5] = tiger;
        array[6] = fish;
        array[7] = fish1;
        array[8] = fish2;
        array[9] = fish3;

        Random rnd = new Random();

            //Прогоняем массив через цикл и проверяем разные числа
            for (int i = 0; i < array.length; i++) {
                array[i].Run(rnd.nextInt(100));
                array[i].Run(rnd.nextInt(1000) + 400);
                array[i].Swim(rnd.nextInt(100));
                array[i].Swim(rnd.nextInt(1000) + 400);
                System.out.println();
            }

        //Счетчики животных
        System.out.println("Котов создано: "+ cat.GetCount());
        System.out.println("Собак создано: "+ dog.GetCount());
        System.out.println("Тигров создано: "+ tiger.GetCount());
        System.out.println("Рыб создано: "+ fish.GetCount()+ "\n");

        //Создаем объекты классов рандомно
        RandomCreate factory = new RandomCreate(new AnimalCreate[]{
            new CatCreate(),
                new DogCreate(),
                new TigerCreate(),
                new FishCreate()
        });
            for(int i = 0; i<3; i++){
            Animal animal = factory.create();
        }
        //Повторно выводим количество животных
        System.out.println("Повтороный подсчет животных после рандомного создания:\n");
        System.out.println("Котов создано: "+ cat.GetCount());
        System.out.println("Собак создано: "+ dog.GetCount());
        System.out.println("Тигров создано: "+ tiger.GetCount());
        System.out.println("Рыб создано: "+ fish.GetCount());
    }
}
