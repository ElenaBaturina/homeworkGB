package first;

public class HomeWorkTho {

    public static void main(String[] args) {
        System.out.println("1 ************");
        sumOfNumbers();
        System.out.println("2 ************");
        number();
        System.out.println("2 (вариант 2) ************");
        numberTwo(-67);
        System.out.println("3 ************");
        numberThree(-50);
        System.out.println("4 ************");
        printWord();
        System.out.println("4 (вариант 2) ************");
        printWordTwo();
        System.out.println("************");
        workout();
        System.out.println("************");
        workoutTwo();

        }

    public static void sumOfNumbers() {
        int a = 10;
        int b = 18;
        int result = a + b;
        boolean c = result >= 10 && result <= 20;
        System.out.println(c);
    }

    public static void number() {
        int a = 67;
        if (a >= 0) {
            System.out.println("Число положительное: " + a);
        } else {
            System.out.println("Число отрицательное: " + a);
        }

    }

    public static void numberTwo(int number) {
        if (number >= 0) {
            System.out.println("Число положительное: " + number);
        } else {
            System.out.println("Число отрицательное: " + number);
        }
    }

    public static void numberThree(int number) {
        int result = number;
        boolean c = result < 0;
        System.out.println(c);
    }

    public static void printWord() {
        for (int i = 10; i <= 15; i++) {
            System.out.println("Hello " + i);
        }

    }

    public static void printWordTwo() {
        for (int i = 1; i <= 5; i++) {
            for (int h = 1; h < 4; h++) {
                System.out.print(i + "Hello ");
            }
            System.out.println();
        }
    }


    public static void workout() {
        for (int i = 0; i < 6; i++) {
            for (int h = 0; h < 6; h++) {
                if (i == 0 || i == 5 || h == 0 || h == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                }
            System.out.println();
          }
        }

    public static void workoutTwo(){
        for (int i = 0; i < 6; i++) {
            for (int h = 0; h < 6; h++) {
                if ( i == 0 || i == 5 || h == 5 || h == 0) {
                    System.out.print("0 ");
                } else if (i > h) {
                    System.out.print("> ");
                } else if (i < h) {
                    System.out.print("< ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }



}