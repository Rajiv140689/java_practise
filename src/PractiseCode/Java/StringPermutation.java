package PractiseCode.Java;

import java.util.Scanner;
import java.util.Arrays;

public class StringPermutation {
    public static void main(String[] args) {
        System.out.println("Enter first string: ");
        String firstString = new Scanner(System.in).nextLine();

        System.out.println("Enter second string: ");
        String secondString = new Scanner(System.in).nextLine();

        boolean isPermuted = arePermuated(firstString, secondString);
        if(isPermuted) {
            System.out.println("Permutation String");
        }
        else {
            System.out.println("Not permutation String");
        }
    }

    public static boolean arePermuated(String s1, String s2) {
        char[] firstStringSort = s1.toLowerCase().toCharArray();
        char[] secondStringSort = s2.toLowerCase().toCharArray();
        Arrays.sort(firstStringSort);
        Arrays.sort(secondStringSort);

        if(firstStringSort.length != secondStringSort.length) {
            return false;
        }
        else {
            int len = (firstStringSort.length > secondStringSort.length) ? firstStringSort.length :
                    secondStringSort.length;

            for(int i = 0; i < len; i++) {
                if (firstStringSort[i] != secondStringSort[i])
                    return false;
            }
            return true;
        }
    }
}
