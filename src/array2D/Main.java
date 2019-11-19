package array2D;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private final static int numRows = 4;
    private final static int numCol = 4;

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] arr;
        int r, c;

        arr = new int[numRows][numCol];
        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numCol; c++) {
                arr[r][c] = rnd.nextInt(10);
            }
        }

        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numCol; c++) {
                if (arr[r][c] < 10)
                    System.out.print(" ");
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

        int maxColSum = 0;
        int column = 0;
        for (r = 0; r < numRows; r++)
            maxColSum += arr[r][0];

        int sum = 0;
        for (c = 1; c < numCol; c++) {
            sum = 0;
            for (r = 0; r < numRows; r++)
                sum += arr[r][c];
            if (sum > maxColSum){
                maxColSum = sum;
                column = c;
            }
        }
        System.out.println("Max column value : " +column+ " [ sum: " +maxColSum+ " ]");

        int minRC = numCol < numRows ? numCol : numRows;
        int mul = 1;
        for (r = 0; r < minRC; r++){
            mul *= arr[r][r];
        }
        System.out.println("Multiplication of main diagonale is: " +mul);

        System.out.println();
        System.out.println("Transp: ");
        for (c = 0; c < numCol; c++){
            for (r = 0; r < numRows; r++){
                if (arr[r][c] < 10)
                    System.out.print(" ");
                System.out.println(arr[r][c]+ " ");
            }
            System.out.println();
        }

        //Who's bigger? pair or not?
        int pairCount = 0, notPairCount = 0;
        for (r = 0; r < numRows; r++){
            for (c = 0; c < numCol; c++){
                if (arr[r][c] % 2 == 0)
                    pairCount++;
                if (arr[r][c] % 2 != 0)
                    notPairCount++;
            }
        }

        if (pairCount > notPairCount)
            System.out.println("More paired numbers");
        else
            System.out.println("More unpaired numbers");

       // Switch some numbers in an array
        int out = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Please, input how many numbers in an array you want to switch: ");
        out = in.nextInt();
        int temp = 0;
        for (int i = 0; i <= out; i++){
            r = rnd.nextInt(4);
            c = rnd.nextInt(4);
            temp = arr[r][c];
            arr[r][c] = arr[r = rnd.nextInt(4)][c = rnd.nextInt(4)];
            arr[r][c] = temp;
        }

        /*
        r = rnd.nextInt(4);
        c = rnd.nextInt(4);
        int temp = 0;
        temp = arr[r][c];
        arr[r][c] = arr[r = rnd.nextInt(4)][c = rnd.nextInt(4)];
        arr[r][c] = temp;
         */

        // Calculate the sum of first and the last row and column.
        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numCol; c++) {
                if (arr[r][c] < 10)
                    System.out.print(" ");
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

        int lastSumCol = 0, lastSumRow = 0, lastSumRow2 = 0;

        for (r = 0; r < numRows; r++){
            for (c = 0; c < numCol; c++){
                if (r == 0)
                    lastSumRow += arr[r][c];
                else {
                    if (r == numRows - 1)
                        lastSumRow += arr[r][c];
                }
            }
        }

        for (r = 0; r < numRows; r++){
            for (c = 0; c < numCol; c++){
                if (c == 0)
                    lastSumCol += arr[r][c];
                else {
                    if (c == numRows - 1)
                        lastSumCol += arr[r][c];
                }
            }
        }

        System.out.println("The summ of the rows: " +lastSumRow);
        System.out.println("The summ of the cols: " +lastSumCol);

        //int[][] tictactoe = {{1,0,2}, {0,1,2}, {0,2,0}};
    }
}
