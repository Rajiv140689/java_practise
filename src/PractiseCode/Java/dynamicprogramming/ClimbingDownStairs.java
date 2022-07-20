package PractiseCode.Java.dynamicprogramming;

import java.util.Scanner;

/*
You are given a number n, representing the number of stairs in a staircase.
You are on the highest step and required to climb down to the bottom
In one move, you are allowed to climb max 3 stairs
You are required to print the number of different paths via which yoy can climb to the top
0<=n<=20

Note:
Total paths to reach Stair 6 from Stair 6 is 1
Moves to reach Stair 6 from Stair 6 is 1
*/
public class ClimbingDownStairs {
    public static void main(String[] args) {
        System.out.println("Enter the number of stairs");
        Scanner sc = new Scanner(System.in);
        Integer noOfStairs = sc.nextInt();
        //sc.nextLine(); //needed this code to move to next line

        Integer totalPathsCount = calculateTotalPath(noOfStairs);
        System.out.println("total paths are: "+ totalPathsCount);
    }

    private static Integer calculateTotalPath(int noOfStairs){
        Integer[] storePathCount = new Integer[noOfStairs + 1];

        storePathCount[0] = 1;
        for(int i = 1; i <= noOfStairs; i++){
            if(i == 1) {
                storePathCount[i] = storePathCount[i - 1];
            } else if(i == 2) {
                storePathCount[i] = storePathCount[i - 1] + storePathCount[i - 2];
            } else {
                storePathCount[i] = storePathCount[i - 1] + storePathCount[i - 2] + storePathCount[i - 3];
            }
        }
        return storePathCount[noOfStairs];
    }
}
