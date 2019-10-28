package sk.itsovy.Artem.pArray;

import java.util.Random;

public class MyArray {
    private int[] arr;
    private String aName;

    public MyArray(int[] arr, String aName) {
        this.arr = arr;
        this.aName = aName;
    }

    public MyArray() {

    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaName() {
        return aName;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public static void test1() {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void test2() {
        Random rnd = new Random();
        int[] arr = new int[10];
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(90) + 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        //Alternative method of using for
        for (int value : arr) {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        }
    }

    public static void test3() {
        System.out.println("--------------------");
        Random rnd = new Random();
        int[] arr = new int[12];
        int sum = 0;
        double Premier = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            Premier = (double) sum / arr.length;
        }
        System.out.println("Premier: " + Premier);

        int max = arr[0], min = arr[0], min2 = arr[0], max2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        min2 = max;
        max2 = min;
        for (int j = 0; j < arr.length; j++) {
            if (min2 > arr[j] && min != arr[j]) {
                min2 = arr[j];
            }
            if (max2 < arr[j] && max != arr[j]) {
                max2 = arr[j];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Second Mix: " + min2);
        System.out.println("Second Max: " + max2);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }
        System.out.println("Counter: " + count);

    }

    /*
    public static void test4(){
        Random rnd = new Random();
        int[] arr = new int[12];
        int max, min = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(100) + 1;
        }
    }
     */

    public static void test4() {
        Random rnd = new Random();
        int[] arr = new int[20];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]);
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] minmax(int a, int b, int c) {
        int[] stock = {a, b, c};
        int[] result = new int[2];
        int min = stock[0], max = stock[0];
        for (int i = 0; i < stock.length; i++) {
            if (min > stock[i])
                min = stock[i];
            if (max < stock[i])
                max = stock[i];
        }
        result[0] = max;
        result[1] = min;
        return result;
    }

    public static void test6() {
        Random rnd = new Random();
        int[] field1 = new int[10];
        for (int i = 0; i < field1.length; i++) {
            field1[i] = (int) Math.pow(2, i);
        }

        for (int i = 0; i < field1.length; i++) {
            System.out.print(field1[i] + " ");
        }

        int[] field2 = new int[10];
        System.out.println(" ");

        for (int i = 0; i < field1.length; i++) {
            field2[9 - i] = field1[i];

        }

        for (int i = 0; i < field2.length; i++) {
            System.out.print(field2[i] + " ");
        }

        // Second variant
        /*
        field1[0] = 1;
        field1[1] = 2;
        for (int i = 2; i < field1.length; i++){
            field1[i] = (field1[i - 1] * 2);
            //field1[i] = rnd.nextInt(90) + 10;

        }
        for(int i = 0; i < field1.length; i++){
            System.out.print(field1[i]+ " ");
        }
         */
    }

}
