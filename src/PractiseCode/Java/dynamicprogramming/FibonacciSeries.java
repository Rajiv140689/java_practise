package PractiseCode.Java.dynamicprogramming;

import java.util.Scanner;

/*
0 1 1 2 3 5 8 13 21 34 55
n = (n-1) + (n-2)
*/
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number for the fibonacciSeries");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();

        Integer fibNumber =  printFibonacciSeries(inputNumber, new int[inputNumber + 1]);
        System.out.println("fibNumber: "+ fibNumber);
    }

    private static Integer printFibonacciSeries(int inputNumber, int[] storeCal){
        if(inputNumber == 0 || inputNumber == 1){
            return inputNumber;
        }

        if(storeCal[inputNumber] != 0){
            return storeCal[inputNumber];
        }
        int num1 = printFibonacciSeries(inputNumber - 1, storeCal);
        int num2 = printFibonacciSeries(inputNumber - 2, storeCal);
        int fibNumber = num1 + num2;

        storeCal[inputNumber] = fibNumber;
        return fibNumber;
    }
}
