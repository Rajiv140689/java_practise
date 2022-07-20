package PractiseCode.Java.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and required to climb to the top
3. You are given n numbers, where ith element's value represents - till how far the step you could jump in a single move. you can of-course fewer number of step in the move.
4. You are required to print the number of minimum moves which you can reach the top of staircase

Note -> If there is no path through the staircase print null

Note:
Total paths to reach Stair 6 from Stair 6 is 1
Moves to reach Stair 6 from Stair 6 is 1
Sample Input:
    10 stairs
Max moves from each stair = 1 1 1 4 9 8 1 1 10 1
output: 5
Approach: We will store the minimum moves in the DP
*/
public class ClimbingStairsWithMinimumMoves {
    public static void main(String[] args) {
        System.out.print("Enter the number of stair case: ");
        Scanner sc = new Scanner(System.in);
        int stairCount = sc.nextInt();

        int[] maxMoveForEachStairArr = new int[stairCount];
        System.out.println("Enter the max moves of particular stair case");
        for(int i = 0; i < stairCount; i++){
            System.out.print("Enter Max move Value: ");
            maxMoveForEachStairArr[i] = sc.nextInt();
        }
        System.out.println("maxMoveForEachStairArr: ");
//        Arrays.stream(maxMoveForEachStairArr).forEach(System.out::println);

        Integer[] dp = new Integer[stairCount + 1];
        //Moves to reach Stair 10 from Stair 10 is 1
        dp[stairCount] = 0;

        for(int j = stairCount - 1; j >= 0; j--){
            int min = Integer.MAX_VALUE;
            for(int k = 1; k <= maxMoveForEachStairArr[j] && (j + k) < dp.length; k++){
                min = Math.min(min, dp[j + k]);
            }
            if(min != Integer.MAX_VALUE){
                dp[j] = min + 1;
            }
        }
//        Arrays.stream(dp).forEach(System.out::println);

        System.out.println("Minimum number of moves are: " + dp[0]);
    }
}
