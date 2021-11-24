package homework1;

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
    public static int locMin = 3;
    public static int locMax = 5;
    public static char emptyRoom = '_';
    public static char readyRoom = '+';
    public static boolean isRandomStartPointPlayer = false;

    // --- Description Enemy
    public static char enemy = 'E';
    public static int healthEnemy = 50;
    public static int strEnemy = 10;
    public static int enemyValueMin = 10;
    public static int enemyValueMax =30;
    public static int countEnemies;

    // --- artifacts
    public static char artifacts = '*';
    public static int healthArtifacts = 20;
    public static int countArtifacts;



    public static void main(String[] args){
        createLocation();
        createPlayer(isRandomStartPointPlayer);
        createEnemy();
        createArtifacts();
        //invisibleLocation();
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
                createArtifacts();
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
        countEnemies = (localWidth + localHeight) / 3;
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


    public static void createArtifacts(){
        countArtifacts = (localWidth + localHeight) / 3;

        int xPosArtifacts;
        int yPosArtifacts;

        for (int i = 0; i < countArtifacts; i++) {
            do {
                xPosArtifacts = random.nextInt(localWidth);
                yPosArtifacts = random.nextInt(localHeight);

            } while (!isEmptyRoom(xPosArtifacts, yPosArtifacts));

            location[xPosArtifacts][yPosArtifacts] = artifacts;
        }

        System.out.println("На поле боя  " + countArtifacts + " бонуса HP.");

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

   /* public static char invisibleLocation() {
        if (enemy == 'E') {
            enemy = '_';
       }
        return enemy;
    } */// так и не получилось нормального результата, перепробовала много вариантов,
    // в результате появляются враги в пустых ячейках, а там где Е не воспринимает врага


    public static void playerNextMoveAction(int lastX, int lastY, int nextX, int nextY){
        if (location[nextY][nextX] ==enemy){
            System.out.println("Осторожно! " + namePlayer + " Вы встретили врага.");
            healthEnemy -= strPlayer / 2;
            healthPlayer -= strEnemy / 2;
            System.out.println("Вы нанесли урон врагу: " +  strPlayer / 2 + "; Враг ранил вас: " + strEnemy / 2 +
                    "; Осталось здоровья: " + healthPlayer + ".");
            if (healthEnemy > 0){
                healthEnemy -= strPlayer;
                healthPlayer -= strEnemy / 2;
                System.out.println("Вы нанесли урон врагу: " +  strPlayer + "; Враг ранил вас: " + strEnemy / 2 +
                        "; Осталось здоровья: " + healthPlayer + ".");
            } else if (healthEnemy > 0) {
                healthEnemy -= strPlayer;
                healthPlayer -= strEnemy;
                System.out.println("Вы нанесли урон врагу: " + strPlayer / 2 + "; Враг ранил вас: " + strEnemy / 2 +
                        "; Осталось здоровья: " + healthPlayer + ".");
            } else {
                System.out.println(namePlayer + " Вы убили врага");
            }

            countEnemies --;
            System.out.println("Врагов осталось: " + countEnemies);
        }

        location[lastY][lastX] = readyRoom;
        location[nextY][nextX] = player;
    }

    public static void playerArtifacts(int lastX, int lastY, int nextX, int nextY){
        if (location[nextY][nextX] ==artifacts){
            System.out.println("Поздравляю! " + namePlayer + " Вы нашли арефакт.");
            healthEnemy += healthArtifacts;
        }
        location[lastY][lastX] = readyRoom;
        location[nextY][nextX] = player;
    } // а как его добавить directionPlayer не разобралась.

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
