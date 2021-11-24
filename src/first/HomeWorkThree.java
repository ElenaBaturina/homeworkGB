package first;

public class HomeWorkThree {

    public static void main(String[] args) {

        System.out.println("************");
        invertArray();
        System.out.println("************");
        fillArray();
        System.out.println("************");
        changeArray();
        System.out.println("************");
        fillDiagonal();
        System.out.println("************");
        oneDimensionalArray(3, 5);
        System.out.println("************");
        minMaxElements();

    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int arrLength = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i = 0; i < arrLength; i++) {
            System.out.print(" > " + arr[i]);
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[101];
        for (int i = 1; i < arr.length; i++) {
            System.out.print(i + " > ");
        }
        System.out.println();
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arrLength = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.print((arr[i] * 2) + " > ");
            } else {
                System.out.print(arr[i] + " > ");
            }
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int[][] arr = new int[7][7];
        for (int y = 0; y < 7; y++) {
            for (int x = 0; x < 7; x++) {
                if (y == x) {
                    arr[y][x] = 1;
                } System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }

    public static void oneDimensionalArray ( int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print("[" + i + "] = " + arr[i] + " ; ");
            }
            System.out.println();
        }

    public static void minMaxElements (){
            int[] arr = {2, 15, -5, 11, 80, 11, 7, 0, 23};
            int min = arr[0];
            int max = arr[0];
            for (int i = 0; i < arr.length; i++){
                if (arr[i] < min){
                    min = arr[i];
                } else if (arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        }




}