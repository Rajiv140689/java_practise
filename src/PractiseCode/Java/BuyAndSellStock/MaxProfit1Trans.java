package PractiseCode.Java.BuyAndSellStock;

import java.util.Scanner;

public class MaxProfit1Trans {
    // inputDays: 6
    // price: 10, 15, 25, 8, 30, 35
    // MaxProfit: HighestPrice - lowestPrice
    // Output: 27

    public static void main(String[] args) {
        System.out.println("Enter number of days: ");
        Scanner inputDays = new Scanner(System.in);
        int daysCount = Integer.parseInt(inputDays.nextLine());

        int[] priceArr = new int[daysCount];
        for(int i = 0; i < daysCount; i++){
            System.out.println("Enter price: ");
            priceArr[i] = Integer.parseInt(inputDays.nextLine());
        }

        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currentDayProfit = 0;

        for(int j = 0; j < priceArr.length; j++){
            if(priceArr[j] < lowestPrice)
                lowestPrice = priceArr[j];

            currentDayProfit = priceArr[j] - lowestPrice;

            if(maxProfit < currentDayProfit)
                maxProfit = currentDayProfit;
        }

        System.out.println("max profit: "+ maxProfit);
    }
}
