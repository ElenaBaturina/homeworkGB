package first;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    // --- Description Player
    public static char player = 'P';
    public static String namePlayer = "Король Артур";
    public static int healthPlayer = 100;
    public static int strPlayer = 30;
    public static int xPasPlayer;
    public static int yPasPlayer;

    public static final int moveUpPlayer = 8;
    public static final int moveLeftPlayer = 4;
    public static final int moveRightPlayer = 6;
    public static final int moveDownPlayer = 2;

    // --- Description Location
    public static char [][] location;
    public static int localWidth;
    public static int localHeight;
    public static int locMin = 4;
    public static int locMax = 7;
    public static char emptyRoom = '_';
    public static char readyRoom = '+';
    public static boolean isRandomStartPointPlayer = true;

    // --- Description Enemy
    public static char enemy = '_';
    public static int healthEnemy = 50;
    public static int strEnemy = 10;
    public static int enemyValueMin = 10;
    public static int enemyValueMax = 30;
    public static int countEnemies;



    public static void main(String[] args){
        createLocation();
        createPlayer(isRandomStartPointPlayer);
        createEnemy();
        printLocation();

        while (true){
            directionPlayer();
            printLocation();
            if (!isAlivePlayer()){
                System.out.println(namePlayer + " погиб!");
                break;
            }
            if (isReadyLocation()) {
                System.out.println(namePlayer + " победил!");
                System.out.println(namePlayer + " - Новый уровень. Новое поле боя.");
                createLocation();
                createPlayer(isRandomStartPointPlayer);
                createEnemy();
                printLocation();

            }
        }
        System.out.println("Конец игры! До свидание.");


    }


    public static void createLocation(){
        localWidth = myRandomValueInt(locMin, locMax);
        localHeight = myRandomValueInt(locMin, locMax);
        location = new char[localHeight][localWidth];

        for (int y = 0; y < localHeight; y++){
            for (int x = 0; x < localWidth; x++){
                location[y][x] = emptyRoom;
            }
        } System.out.println("New location created. Size " + localWidth + "x"+ localHeight);
    }

    public static void createPlayer(boolean isRandom){
        if (isRandom){
            xPasPlayer = myRandomValueInt(0, localWidth - 1);
            yPasPlayer = myRandomValueInt(0, localHeight - 1);
        } else {
            xPasPlayer = 0;
            yPasPlayer = 0;
        }
        location[yPasPlayer][xPasPlayer] = player;
        System.out.println(namePlayer + " начинает свое сражение! [" + xPasPlayer + ":" + yPasPlayer + "]");
    }

    public static void createEnemy(){
        countEnemies = (localWidth + localHeight) / 2;
        healthEnemy = myRandomValueInt(enemyValueMin, enemyValueMax);
        strEnemy = myRandomValueInt(enemyValueMin, enemyValueMax);

        int xPosEnemy;
        int yPosEnemy;

        for (int i = 0; i < countEnemies; i++) {
            do {
                xPosEnemy = random.nextInt(localWidth);
                yPosEnemy = random.nextInt(localHeight);

            } while (!isEmptyRoom(xPosEnemy, yPosEnemy));

           location[yPosEnemy][xPosEnemy] = enemy;
            }

        System.out.println("На поле боя его поджидает " + countEnemies + " врагов. (HP = "  + healthEnemy + "; STR = " + strEnemy + ")");
        }

    public static void directionPlayer(){
        int courrentX = xPasPlayer;
        int courrentY = yPasPlayer;

        int playerMoveValue;
        do {
            System.out.print("Введите направление для хода героя: (UP=" + moveUpPlayer + "| DOWN=" + moveDownPlayer +
                    "| LEFT=" + moveLeftPlayer + "| RIGHT=" + moveRightPlayer + ") ->>> ");
            playerMoveValue = scanner.nextInt();

            switch (playerMoveValue) {
                case  moveUpPlayer:
                    yPasPlayer -=1;
                    break;
                case moveDownPlayer:
                    yPasPlayer +=1;
                    break;
                case moveLeftPlayer:
                    xPasPlayer -=1;
                    break;
                case moveRightPlayer:
                    xPasPlayer +=1;
                    break;

            }


        } while (!isValidMovaPlayer(courrentX, courrentY, xPasPlayer, yPasPlayer));
        playerNextMoveAction(courrentX, courrentY, xPasPlayer, yPasPlayer);
    }

    public static void playerNextMoveAction(int lastX, int lastY, int nextX, int nextY){
        if (location[nextY][nextX] ==enemy){
            healthPlayer -= strEnemy;
            countEnemies --;
            System.out.println("Осторожно! Враг нанес урон " + namePlayer + " = " + strEnemy + "hp. " + namePlayer +
                    " здоровье " + healthPlayer + ".");
            System.out.println("Врагов осталось: " + countEnemies);
        }

        location[lastY][lastX] = readyRoom;
        location[nextY][nextX] = player;
    }

    public static boolean isValidMovaPlayer(int currentX, int currentY, int nextX, int nextY){
        if (nextX >= 0 && nextX < localWidth && nextY >= 0 && nextY < localHeight) {
            System.out.println(namePlayer + " перешел в [" + nextX + ":" + nextY + "]");
            return true;
        } else {
            System.out.println("Ход не верный! Попробуйте снова.");
            xPasPlayer = currentX;
            yPasPlayer = currentY;
            return false;
        }
    }

    public static boolean isEmptyRoom(int x, int y){
        return location[y][x] == emptyRoom;
    }

    public static void printLocation() {
        System.out.println("===> Поле битвы <===");
        for (int y = 0; y < localHeight; y++) {
            for (int x = 0; x < localWidth; x++) {
                System.out.print(location[y][x] + "|");
            }
            System.out.println();
        } System.out.println("====================");
    }


    public static int myRandomValueInt(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }


    public static boolean isAlivePlayer(){
        return healthPlayer > 0;
    }


    public static boolean isReadyLocation(){
        for (int y = 0; y < localHeight; y++){
            for (int x = 0; x < localWidth; x++){
                if (location[y][x] == emptyRoom){
                    return false;
                }
            }
        } return true;
    }



















}
