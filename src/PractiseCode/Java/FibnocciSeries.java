package PractiseCode.Java;

import java.util.Scanner;

public class FibnocciSeries {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibN = Fib(n, new int[n+1]);
        System.out.println("fib: "+ fibN);
    }

    public static int Fib(int n, int[] storeValue){
        if(n==0 || n == 1){
            return n;
        }
        if(storeValue[n] != 0)
            return storeValue[n];

        int fib1 = Fib(n-1, storeValue);
        int fib2 = Fib(n-2, storeValue);
        int fibN = fib1 + fib2;

        storeValue[n] = fibN;
        return fibN;
    }

}
