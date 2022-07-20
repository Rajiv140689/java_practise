package PractiseCode.Java.BuyAndSellStock;

import java.util.Scanner;

//Capture profit at every high - We need to buy and then sell, we can't have consecutive buy
//refer: https://www.youtube.com/watch?v=HWJ9kIPpzXs
//input: 2, 5, 7, 4, 1, 6, 8, 5, 10, 20 inputDays = 10
//7-2 = 5, 8-1=7, 20-5 = 15 ans => 5 + 7 + 15 = 27

//input: 2, 5, 7, 4, 1 inputDays = 5
//7-2 = 5 ans => 5

//price[] = {10, 22, 5, 75, 65, 80} inputDays = 6
//22-10 = 12, 75-5 = 70, 80-65 = 15 => 12 + 70 + 15 = 97

public class CaptureAllProfitInfiniteTime {
    public static void main(String[] args) {
        System.out.print("Enter number of days: ");
        Scanner inputDays = new Scanner(System.in);
        int daysCount = Integer.parseInt(inputDays.nextLine());

        int[] priceArr = new int[daysCount];
        for(int i = 0; i < daysCount; i++){
            System.out.print("Enter price and press enter: ");
            priceArr[i] = Integer.parseInt(inputDays.nextLine());
        }

        int sellDate = 0;
        int buyDate = 0;
        int profit = 0;

        //Starting from position 1 so that we can have [i-1] value available for that array
        for(int i = 1;  i < priceArr.length; i++){
            if(priceArr[i] >= priceArr[i-1]) {
                sellDate++;
            }
            else {
                // during dip time buy and sell date will be same and profit will be 0
                profit += priceArr[sellDate] - priceArr[buyDate];
                buyDate = sellDate = i;
            }
        }

        // This will capture the last sell
        profit += priceArr[sellDate] - priceArr[buyDate];

        System.out.println("profit: " + profit);
    }
}
