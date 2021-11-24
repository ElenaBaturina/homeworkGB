package HomeWork6;

import HomeWork5.Employee;

import java.util.HashSet;
import java.util.Set;

public class HomeWorkSix extends Object{

    public static void main(String[] args) {

        System.out.println("***");
        Dog dog1 = new  Dog("Собака", "Граф", 250);
        Cat cat1 = new  Cat("Кошка", "Маша", 250);
        dog1.run();
        cat1.run();

        System.out.println("***");
        Dog dog2 = new  Dog("Собака", "Ден", 5);
        Cat cat2 = new  Cat("Кошка", "Мори", 3);
        dog2.toSail();
        cat2.toSail();

        System.out.println("***");
        Dog dog3 = new  Dog("Собака", "Линда", 700);
        Cat cat3 = new  Cat("Кошка", "Юля", 120);
        dog3.run();
        cat3.run();

        System.out.println("***");
        Dog dog4 = new  Dog("Собака", "Цезарь", 15);
        Cat cat4 = new  Cat("Кот", "Дым", 10);
        dog4.toSail();
        cat4.toSail();



              // ограничения бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м
    }





}
