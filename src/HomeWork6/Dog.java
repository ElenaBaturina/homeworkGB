package HomeWork6;

public class Dog extends Animals {

    private int distanceMaxRun = 500;
    private int distanceMaxToSail = 10;

    public Dog(String view, String name, int distance){
        super(view, name, distance);
    }


    @Override
    public void run() {
        if (distance <= distanceMaxRun) {
            System.out.println(view + "  " + name + "  пробежал " + distance + " метров.");
        } else {
            System.out.println("Длина препятсвия " + distance + " метров для " + view + "  " + name +" слишком большая.");
        }
    }

    @Override
    public void toSail(){
        if (distance <= distanceMaxToSail) {
            System.out.println(view + "  " + name + " проплыл " + distance + " метров.");
        } else {
            System.out.println("Длина препятсвия для плавания " + distance + " метров для " + view + "  " + name +" слишком большая.");
        }
    }

    // ограничения бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м

}
