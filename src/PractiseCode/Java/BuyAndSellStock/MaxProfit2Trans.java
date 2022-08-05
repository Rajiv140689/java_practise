package PractiseCode.Java.BuyAndSellStock;

//In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to
//make at most 2 transactions in a day, whereas the second transaction can only start after the first one is
//complete (Buy->sell->Buy->sell). Given stock prices throughout the day, find out the maximum profit that
//a share trader could have made.
//
//    Examples:
//
//    Input:   price[] = {10, 22, 5, 75, 65, 80}
//    Output:  87
//    Trader earns 87 as sum of 12, 75
//    Buy at 10, sell at 22,
//    Buy at 5 and sell at 80

//Find the point where we can get the max sell profit
//left to right

//Find the point where we can get the max Buy profit
//Right to left

import java.util.Scanner;

public class MaxProfit2Trans {
    public static void main(String[] args) {
        System.out.print("Enter no of days: ");
        Scanner inputDaysSC = new Scanner(System.in);
        int daysCount = Integer.parseInt(inputDaysSC.nextLine());

        int[] priceArr = new int[daysCount];
        for(int i = 0; i < daysCount; i++){
            System.out.print("Enter price for the day: ");
            priceArr[i] = Integer.parseInt(inputDaysSC.nextLine());
        }

        //Find the point where we can get the max sell profit
        int lowestBuy = priceArr[0];
        int[] maxSellProfitArr = new int[priceArr.length];
        int todaySellProfit = 0;
        for(int i = 1; i < priceArr.length; i++){
            if(priceArr[i] < lowestBuy) {
                lowestBuy = priceArr[i];
            }

            todaySellProfit = priceArr[i] - lowestBuy;

            if(todaySellProfit > maxSellProfitArr[i-1]){
                maxSellProfitArr[i] = todaySellProfit;
            }
            else {
                maxSellProfitArr[i] = maxSellProfitArr[i - 1];
            }
        }

        System.out.print("maxSellProfitArr: ");
        int k = 0;
        while(k < maxSellProfitArr.length){
            System.out.print(maxSellProfitArr[k] + ", ");
            k++;
        }


        //Find the point where we can get the max Buy profit
        int highestSell = priceArr[priceArr.length - 1];
        int[] maxBuyProfitArr = new int[priceArr.length];
        int todayBuyProfit = 0;
        for(int i = priceArr.length - 2; i >= 0; i--){
            if(priceArr[i] > highestSell) {
                highestSell = priceArr[i];
            }

            todayBuyProfit = highestSell - priceArr[i];

            if(todayBuyProfit > maxBuyProfitArr[i+1]){
                maxBuyProfitArr[i] = todayBuyProfit;
            }
            else {
                maxBuyProfitArr[i] = maxBuyProfitArr[i + 1];
            }
        }

        System.out.print("maxBuyProfitArr: ");
        int j = 0;
        while(j < maxBuyProfitArr.length){
            System.out.print(maxBuyProfitArr[j] + ", ");
            j++;
        }


        System.out.print("maxProfit: ");
        int maxProfit = 0;
        for(int i = 0; i < priceArr.length; i++){
            if(maxSellProfitArr[i] + maxBuyProfitArr[i] > maxProfit)
                maxProfit = maxSellProfitArr[i] + maxBuyProfitArr[i];
        }
        System.out.println("maxProfit: "+maxProfit);
//
    }
}

// This code is contributed by gauravrajput1
