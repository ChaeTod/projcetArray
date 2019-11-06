package sk.itsovy.Artem.pArray;

import sk.itsovy.Artem.School.Person;
import sk.itsovy.Artem.School.Student;
import sk.itsovy.Artem.School.Teacher;
import sun.plugin.viewer.frame.WNetscapeEmbeddedFrame;

import java.util.Random;
import java.util.Scanner;

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

    public static void test7() {
        int[] b3n = {38, 47, 5, 29, 112, 65, 75};
        int size = 0;
        for (int i = 0; i < b3n.length; i++) {
            if (b3n[i] % 3 != 0) {
                size++;
            }
            System.out.print(b3n[i] + " ");
        }
        int[] f = new int[size];
        System.out.println(" ");
        System.out.println("----------------------");
        int j = 0;
        for (int i = 0; i < b3n.length; i++) {
            if (b3n[i] % 3 != 0) {
                f[j] = b3n[i];
                j++;
            }
        }
        for (int value : f) {
            System.out.print(value + " ");
        }

        /* Copy an array
        int[] c = new int[b3n.length];
        System.out.println(" ");
        for (int i = 0; i < b3n.length; i++){
            c[i] = b3n[i];
            System.out.print(c[i]+ " ");
        }
         */
        //int[] c = b3n.clone(); //Second method to copy an array

        int[] c = new int[b3n.length]; //Third method to copy an array
        System.arraycopy(b3n, 0, c, 0, b3n.length);
        for (int value : c)
            System.out.print(value + " ");
    }

    public static void test8() {
        Random rnd = new Random();
        int[] arr = new int[20];
        int[] arr2 = new int[arr.length];

        /*
        for (int i = 0 ; i < arr.length; i++){
            arr[i] = rnd.nextInt(50) + 1;
            arr2[i] = rnd.nextInt(50) + 1;
        }
        for (int i = 0 ; i < arr.length; i++){
            if (arr2[i] == arr[i]){
                System.out.print(arr2[i]+ " ");
            } else {
                arr2[i] = rnd.nextInt(50) + 1;
            }
        }*/


        arr[0] = rnd.nextInt(50) + 1;
        arr[1] = rnd.nextInt(50) + 1;
        int temp = 0;
        if (arr[0] != arr[1]) {
            for (int i = 2; i < arr.length; i++) {
                arr[i] = rnd.nextInt(50) + 1;
                if (arr[i] == arr[i - (i - 1)]){
                    arr[i] = rnd.nextInt(50) + 1;
                } else {
                    i--;
                }
            }
        }

        // Check if numbers are not duplicated anywhere
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] || arr[i] == arr[i - 2]) {
                System.out.println("This number is duplicated - " + arr[i] + "!");
            }
        }

        System.out.println(" ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

/*
        //Example
        int[] a = new int[20];
        int temp;
        for (int i = 0; i < a.length; i++){
            int count = 0;
            temp = rnd.nextInt(50) + 1;
            for (int j = 0; j < 1; j++){
                if(temp == a[j]){
                    count = 1;
                    break;
                }
            }
            if (count == 0){
                a[i] = temp;
                i++;
            }
            else
                i--;
        }
 */

        /* // Still got mistakes
        int[] a = new int[20];
        int temp;
        for (int i = 0; i < a.length; i++){
            //int count = 0;
            temp = rnd.nextInt(50) + 1;
            for (int j = 0; j < a.length; j++){
                if (temp == a[i]){
                    temp = rnd.nextInt(50) + 1;
                    break;
                } else {
                    a[i] = temp;
                }
            }
        }

        for (int value : a)
            System.out.print(value+ " ");

         */
    }

    public static void test9() {
        Random rnd = new Random();
        Student[] person1 = new Student[5];
        for (int i = 0; i < person1.length; i++) {
            person1[i] = new Student("Noname " + i, rnd.nextInt(68) + 10, "1n");
        }

        for (Student temp : person1){
            if (temp.getAge() < 18){
                System.out.println("This student younger than 18! Name: " + temp.getName()+ ". Age: " +temp.getAge());
            } else {
                System.out.println(temp.getName() + " " + temp.getAge());
            }
        }

        Teacher[] teachers = new Teacher[8];
        for (int i = 0; i < teachers.length; i++){
            teachers[i] = new Teacher("mTeacher" +i, rnd.nextInt(68) + 21, rnd.nextInt(501) + 500);
        }

        for (Teacher temp : teachers){
            if (temp.getSalary() >= (850 + 85) || temp.getSalary() >= (850 - 85))
                System.out.println(temp.getName()+ " " +temp.getAge()+ " " +temp.getSalary());
        }


    }


    public static void test10(){
        String[] names = {"Ivan", "Peter", "Erik", "Zuzana", "Leo", "Valiant"};
        System.out.println("The names are: ");

        /* // Show all names
        for (String temp : names){
                System.out.println(temp);
        }
         */

        //Show name with 'a' inside
        for (int i = 0; i < names.length; i++){
            if (names[i].contains("a") || names[i].contains("A"))
                System.out.print(names[i]+ " ");
        }
        //show the shortest and the longest names
        int max = names[0].length();
        int min = names[0].length();
        for (int i = 1; i < names.length; i++){
            if (names[i].length() > max)
                max = names[i].length();
            if (names[i].length() < min)
                min = names[i].length();
        }
        System.out.println(" ");
        System.out.println(max+ " " +min);
        //Show the names which are the longest and the shortest
        for (int i = 0; i < names.length; i++){
            if (max == names[i].length())
                System.out.print(names[i]+ " ");
            if (min == names[i].length())
                System.out.print(names[i]+ " ");
        }


        System.out.println(" ");
        //Show the names with the upper case
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i].toUpperCase()+ " ");
        }

        System.out.println(" ");
        //Show the names without any vowels
        for (int i = 0; i < names.length; i++){
            String sName = names[i];
            for (int j = 0; j < sName.length(); j++){
                String temp = String.valueOf(sName.charAt(j));
                if ("AEIOUYaeiouy".contains(temp)){
                    System.out.print(".");
                } else {
                    System.out.print(temp);
                }
            }
            System.out.print("  ");
        }
    }

    public static void test11(){
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        //String word = "";
        word = word.trim(); // Delete all empty spaces
        int length = word.length();
        for (int i = length - 1; i >= 0; i--){
            System.out.print(word.charAt(i)+ "");
        }
    }
    //Tredici algorithm
    public static void test12(){
        int[] arr = {5, 12, 14, 9, 10};
        for (int i = 0; i < 4; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int value : arr)
            System.out.print(value+ " ");
    }

    //Bubble sort algorithm
    public static void test13(){
        int[] arr = {5, 14, 25, 7, 10};
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] < arr[ j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int value : arr)
            System.out.print(value+ " ");
    }
        /*
        for (int value : arr)
            System.out.print(value+ " ");
*/
        /*
        // Quick repeat - Fibonachi numbers
        int[] arr = new int[20];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int value : arr)
            System.out.print(value+ " ");
         */


        /*
        // Repeat - Whole Diamond
        for (int i = 0; i <= 10; i++){
            for (int j = i; j <= 10; j++){
                System.out.print("   ");
            }
            for (int k = 1; k <= i * 2 + 1; k++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

        for (int i = 9; i >= 0; i--){
            for (int j = i; j <= 10; j++){
                System.out.print("   ");
            }
            for (int k = 1; k <= i * 2 + 1; k++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

         */

        /*
        for (int i = 0; i <= 10; i++){

            for (int k = i; k >= 0; k--){
                System.out.print("  ");
            }
            for (int j = 0; j <= 10; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

         */



}
