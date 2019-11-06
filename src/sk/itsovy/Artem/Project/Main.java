package sk.itsovy.Artem.Project;

public class Main {
    public static void main(String[] args) {
        MyArray arr = new MyArray(10);
        arr.generateValues(10, 90);

        arr.showArr();
        System.out.println("Minimum is: " + arr.min());
        System.out.println("Maximum is: " + arr.max());
        System.out.println("The second minimum: " + arr.min2());
        System.out.println("The second maximum: " + arr.max2());
        System.out.println("The Average is: " + arr.getAverageValue());
        System.out.println("Input the value which you want to count inside an array: ");
        System.out.println("The count of inputted value: " + arr.countOfValues(arr.inputNeedValue()));

        arr.showArr();
        System.out.println("Input the position of the number to show: ");
        System.out.println(arr.getItem(arr.inputNeedValue()));
        System.out.println(" ");
        System.out.println("Please, input the number you want to add to the end of an array: ");
        arr.addItem(arr.inputNeedValue());
        System.out.println("The new array:  ");

        arr.showArr();
        System.out.println("The sorted array: ");
        arr.sort(true);
        System.out.println(" ");
        System.out.println("The incremented array: ");
        arr.incrementValues();
        arr.showArr();

        System.out.println("Input the new the value and the position where it will be: ");
        arr.addItem(arr.inputNeedValue(), arr.inputNeedValue());

        System.out.println("The count of the even numbers: " +arr.countOfEvenValues());
        System.out.println("Input the number to find if it appear in array: ");
        arr.contains(arr.inputNeedValue());

        int[] rez = arr.copy(); // Testing of copy
        for (int value : rez)
            System.out.print(value+ " ");


// Fast tests
/*
        int[] rez = arr.copy();
        for (int i = 0; i < rez.length; i++) {
            System.out.print(rez[i] + " ");
        }

        int[] arrp = {-200, 200,-25, -6, 25, -12, 0, 4, 55, 45, 35, -76}; // Testing of finding the even numbers
        MyArray arr3 = new MyArray(arrp);

        System.out.println(" ");
        System.out.println("Minimum is: " + arr3.min());
        System.out.println("Maximum is: " + arr3.max());
        System.out.println("The second minimum: " + arr3.min2());
        System.out.println("The second maximum: " + arr3.max2());

        System.out.println("The even numbers in second array are: " + arr3.countOfEvenValues());

 */
    }

}
