package PractiseCode.Java.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

//Input: exp = “((()))”
//Output: Balanced
//
//Input: exp = “((())”
//Output: Not Balanced

public class BalancedParanthesis {
    public static void main(String[] args) {
        System.out.println("Enter the input paranthesis: ");
        Scanner inputScanner = new Scanner(System.in);
        String inputParanthesis = inputScanner.next();

        Boolean isBalancedParanthesis = checkIsBalancedParenthesis(inputParanthesis);
        if (isBalancedParanthesis){
            System.out.println(inputParanthesis + " is balanced paranthesis");
        }
        else {
            System.out.println(inputParanthesis + " is not a balanced paranthesis");
        }
    }

    private static Boolean checkIsBalancedParenthesis(String inputString){
        Stack<String> storeOpeningParenthesis = new Stack<String>();
        for(int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '(') {
                storeOpeningParenthesis.add("(");
            } else {
                if (!storeOpeningParenthesis.isEmpty()) {
                    storeOpeningParenthesis.pop();
                } else {
                    return false;
                }
            }
        }
        if (storeOpeningParenthesis.isEmpty()){
            return true;
        }
        return false;
    }
}
