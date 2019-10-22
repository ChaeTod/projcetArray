package sk.itsovy.Artem.pArray;

import java.util.Random;

public class MyArray {
    private int[] arr;
    private String aName;

    public MyArray(int[] arr, String aName){
        this.arr = arr;
        this.aName = aName;
    }

    public MyArray(){

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

    public static void test1(){
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void test2(){
        Random rnd = new Random();
        int[] arr = new int[10];
        System.out.println("");
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(90) + 10;
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
        for (int i = arr.length - 1 ; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.print(arr[i]+ " ");
            }
        }
        //Alternative method of using for
        for (int value:arr){
            if (value % 2 == 0){
                System.out.print(value+ " ");
            }
        }
    }

}
