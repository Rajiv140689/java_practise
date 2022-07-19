package PractiseCode.Java.BuyAndSellStock;

import java.util.Scanner;

//Capture profit at every high
//refer: https://www.youtube.com/watch?v=HWJ9kIPpzXs
//input: 2, 5, 7, 4, 1, 6, 8, 5, 10
//7-2 = 5, 8-1=7, 10-5 = 5 ans = 5+7+5

//price[] = {10, 22, 5, 75, 65, 80}

public class CaptureAllProfitInfiniteTime {
    public static void main(String[] args) {
        System.out.println("Enter number of days: ");
        Scanner inputDays = new Scanner(System.in);
        int daysCount = Integer.parseInt(inputDays.nextLine());

        int[] priceArr = new int[daysCount];
        for(int i = 0; i < daysCount; i++){
            System.out.println("Enter price and press enter: ");
            priceArr[i] = Integer.parseInt(inputDays.nextLine());
        }

        int sellDate = 0;
        int buyDate = 0;
        int profit = 0;

        //Starting from position 1 so that we can i-1 for that array
        for(int i = 1;  i < priceArr.length; i++){
            if(priceArr[i] >= priceArr[i-1]) {
                sellDate++;
            }
            else {
                profit += priceArr[sellDate] - priceArr[buyDate];
                buyDate = sellDate = i;
            }
        }

        profit += priceArr[sellDate] - priceArr[buyDate];

        System.out.println("profit: " + profit);
    }
}
