package HomeWork6;

import java.util.HashSet;
import java.util.Set;

public class Cat extends Animals{

    private int distanceMaxRun = 200;
    private int distanceMaxToSail = 0;

    public Cat(String view, String name, int distance){
        super(view, name, distance);
    }


    @Override
    public void run(){
        if (distance <= distanceMaxRun) {
            System.out.println(view + "  " + name + "  пробежала " + distance + " метров.");
        } else {
            System.out.println("Длина препятсвия " + distance + " метров для " + view + "  " + name +" слишком большая.");
        }
    }

    @Override
    public void toSail(){
        if (distance <= distanceMaxToSail) {
            System.out.println(view + "  " + name + " Проплыла " + distance);
        } else {
            System.out.println(view + "  " + name + " Не умеет плавать.");
        }
        }



    // ограничения бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м

}
