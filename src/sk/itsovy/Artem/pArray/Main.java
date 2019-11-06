package sk.itsovy.Artem.pArray;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rnd = new Random(0);
        MyArray arr1 = new MyArray();
        //MyArray.test1();
        //MyArray.test2();
        //MyArray.test3();
        //MyArray.test4();
        int[] stock = MyArray.minmax(4, 8, 10);
        //System.out.println("The Maximum is: " +stock[0]+ " and the Minimum is:  " +stock[1]);
        //MyArray.minmax(4,8,3);
       // MyArray.test6();
    }
}
