package sk.itsovy.Artem.Project;

import java.util.DoubleSummaryStatistics;

public interface ArrayMethods {
    public double getAverageValue();
    public int min();
    public int max();

    public int min2(); //Initialize of with, which means - it's need to be initialized you slowly snail!
    public int max2(); //Initialize of with, which means - it's need to be initialized you lazy snail!

    public void generateValues(int a, int b);

    public boolean contains(int value); //Is the value inside the massive or not. If yes - return - true;

    public int countOfValues(int value); //Count the amount of values inside the array.

    public int countOfEvenValues(); //Count of not even number is even numbers - whole numbers

    public void incrementValues(); //Add 1 to all numbers in the array

    public void sort(boolean asc); // If yes - sort by the biggest, false - by the smallest

    public void showArr();

    public void addItem(int newValue); // add the new number to the end of the field

    public void addItem(int newValue, int position); // (free) add the number to the specific position at the array. Need to move whole numbers to the right.

    public int[] copy(); // return the new array copied from the basic array

    public  int getItem(int position); // return the number on selected position

}
