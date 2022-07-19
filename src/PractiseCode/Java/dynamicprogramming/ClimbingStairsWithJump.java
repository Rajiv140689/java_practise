package PractiseCode.Java.dynamicprogramming;

import java.util.Scanner;

/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and required to climb to the top
3. You are given n numbers, where ith element's value represents - till how far the step you could jump in a single move. you can of-course fewer number of step in the move.
4. You are required to print the number of different paths via which you can climb to the top.

Example: 5 stairs

array contains max jump from a particular stairs = 2, 3, 0, 1, 2, 3 it means from 0th stair you can jump to max two
stairs, from 1st stair you can jump to 3 stairs....

5 stairs then DP will be n + 1 = 5 + 1-> 0 1 2 3 4 5 6
*/
public class ClimbingStairsWithJump {
    public static void main(String[] args) {
        System.out.println("Enter stair Jump array value");
        Scanner sc = new Scanner(System.in);
        int stairCount = sc.nextInt();

        int[] stairJumpValueArr = new int[stairCount];
        for(int i = 0; i < stairCount; i++){
            stairJumpValueArr[i] = sc.nextInt();
        }
        System.out.println("stairJumpValueArr: " + stairJumpValueArr);

        //stairCount = 5 -> 0, 1, 2, 3, 4 but we need 5 also so stairCount + 1
        int[] dp = new int[stairCount + 1];

        dp[stairCount] = 1;
        for(int i = stairCount - 1; i >= 0; i--){
            for(int j = 1; j < stairJumpValueArr[i] && (i + j) < dp.length; j++){
                dp[i] += dp[i + j];
            }
        }

        System.out.println("different path count to reach to the top: " + dp[0]);
    }
}
