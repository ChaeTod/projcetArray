package sk.itsovy.Artem.Project;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Random;
import java.util.Scanner;

public class MyArray implements ArrayMethods {
    private int[] arr;
    private int size;

    public MyArray(int size) {
        if (size <= 0) {
            error("Cannot declare array with size: " + size);
        } else {
            this.size = size;
            arr = new int[size];

            resetArrayToZero();
        }
    }

    private void resetArrayToZero() {
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
    }

    public MyArray(int[] input) {
        if (input == null || input.length == 0) {
            error("Cannot declare array with size: " + size);
        } else {
            this.arr = input;
            this.size = input.length;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public void generateValues(int a, int b) {
        if (b > a) {
            Random rnd = new Random();
            for (int i = 0; i < size; i++) {
                arr[i] = rnd.nextInt(Math.abs((a - b) + 1)) + a;
            }
        } else {
            error("You inputted the wrong numbers to generate random! The second number must be bigger then first!");
        }
    }

    public void error(String massage) {
        System.out.println(massage);
        System.out.println("Application will terminate");
        System.exit(0);
    }

    public void showArr() {
        System.out.println(" ");
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println(" ");
    }

    @Override
    public int[] copy() {
        int[] c = new int[size];
        for (int i = 0; i < size; i++) {
            c[i] = arr[i];
        }
        return c;
        /* //Another method
        int[] c = arr.clone();

        //Another method
        return arr.clone();
         */
    }

    @Override
    public int min() {
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public int max() {
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    @Override
    public int min2() {
        int min1 = arr[0], min2 = 0;
        for (int i = 0; i < size; i++) {
            if (min1 > arr[i]) {
                min2 = min1;
                min1 = arr[i];
            } else {
                if (min1 < arr[i] && min2 > arr[i])
                    min2 = arr[i];
            }
        }
        return min2;
    }

    @Override
    public int max2() {
        int max1 = 0, max2 = 0;
        for (int i = 0; i < size - 1; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            } else {
                if (arr[i] < max1 && arr[i] > max2)
                    max2 = arr[i];
            }
        }
        return max2;
    }

    @Override
    public double getAverageValue() {
        double avrg = 0;
        for (int i = 0; i < size; i++) {
            avrg = avrg + arr[i];
        }
        return avrg / size;
    }

    public int inputNeedValue() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    @Override
    public int countOfValues(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value)
                count++;
        }
        return count;
    }

    @Override
    public void addItem(int newValue) {
        arr[size - 1] = newValue;
    }

    @Override
    public void sort(boolean asc) {
        if (asc) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        for (int value : arr)
            System.out.print(value + " ");
    }

    @Override
    public int getItem(int position) {
        return arr[position - 1];
    }

    @Override
    public void incrementValues() {
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    @Override
    public void addItem(int newValue, int position) {
        if (position > size || position < 0) {
            error("Warning! Position can't be smaller then 0 and bigger then the size of an array! Got: " + position);
        } else {
            int[] sArr = new int[size + 1];
            int j = 0;
            for (int i = 0; i < sArr.length; i++){
                if (i == position) {
                    sArr[i] = newValue;

                }
                else{
                    sArr[i] = arr[j];
                    j++;
                }
            }
            for (int value : sArr)
                System.out.print(value+ " ");
        }
    }

    @Override
    public int countOfEvenValues() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }
        return count;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.out.println("Yes, array contain this number!");
                return true;
            }
        }
        System.out.println("No, array doesn't contain this number!");
        return false;
    }
}
