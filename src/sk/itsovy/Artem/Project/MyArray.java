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
        /*
        for (int i = 0; i < size - 1; i++){
            for (int j = 0; j < size - 1 - i; j++){
                if (arr[j] > arr[j + 1] || (--------------)) //remade!
            }
        }

       */
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
        /*
        if (position < 0) {
            error("Warning! Position can't be smaller then 0 and bigger then the size of an array! Got: " + position);
        } else {
            if (position >= size)
                addItem(newValue);
            else {
                int[] newArr = new int[size + 1];
                for (int i = 0; i < position; i++) {
                    newArr[i] = arr[i];
                }

                newArr[position] = newValue;

                for (int j = 0; j <)

            }
        }

         */

        /*
        if (position < 0) {
            error("Warning! Position can't be smaller then 0 and bigger then the size of an array! Got: " + position);
        } else {
            //if (position >= size){
                //addItem(newValue);
            //}
        //else {
                int[] sArr = new int[size + 1];
                int j = 0;
                for (int i = 0; i < sArr.length; i++) {
                    if (i == position) {
                        sArr[i] = newValue;

                    } else {
                        sArr[i] = arr[j];
                        j++;
                    }
                }
            //}
            for (int value : sArr)
                System.out.print(value+ " ");
        }

         */
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

    public String longNumSum(String str1, String str2) {
        //If the second string bigger then first, change their places
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        String resStr = ""; // String to store the result of summing
        int longStr1 = str1.length(), longStr2 = str2.length(); // Write the length of two strings
        int digitMove = 0; // Calculate the moved digit, if the sum of two numbers is bigger then 9

        StringBuilder reverseStr1 = new StringBuilder();

        reverseStr1.append(str1);
        reverseStr1.reverse();

        StringBuilder reverseStr2 = new StringBuilder();

        reverseStr2.append(str2);
        reverseStr2.reverse();

        for (int i = 0; i < longStr1; i++) {
            // Calculate the sum of current digits and digitMove
            int sum = ((int) (str1.charAt(i) - '0') + (int) (str2.charAt(i) - '0') + digitMove);
            resStr = resStr + (char) (sum % 10 + '0');

            digitMove = sum / 10; // Resign new added digit
        }

        // Add some remain digits of larger number
        for (int i = longStr1; i < longStr2; i++) {
            int sum = ((int) (str2.charAt(i) - '0') + digitMove);
            resStr = resStr + (char) (sum % 10 + '0');

            digitMove = sum / 10; // resign new added digit
        }

        // Add remaining digitMove
        if (digitMove > 0)
            resStr = resStr + (char) (digitMove + '0');

        // Reverse result String
        StringBuilder reverseSTR = new StringBuilder();

        reverseSTR.append(resStr);
        reverseSTR.reverse();

        return resStr;
    }

    public void ReverseArr(){
/*
        int[] arr2 = new int[size + 1];
        for (int i = 0; i < size; i++){
           arr2[size - i - 1] = arr[i];
        }
        arr = arr2;

 */

        for (int i = 0; i < size/2; i++){
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }


    }

    public void randomize(){
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            int index1 = rnd.nextInt(size);
            int index2 = rnd.nextInt(size);
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
}
