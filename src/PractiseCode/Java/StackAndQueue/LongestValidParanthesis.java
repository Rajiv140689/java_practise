package PractiseCode.Java.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class LongestValidParanthesis {
    public static void main(String[] args) {
        System.out.println("Enter paranthesis String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Stack<String> storeBraces = new Stack();
        Stack<Integer> storeInvalidIndex = new Stack();
        storeInvalidIndex.add(-1);
        int maxValidParanthesisLength = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '(') {
                storeBraces.add("(");
                storeInvalidIndex.add(i);
            }
            else if (!storeBraces.isEmpty() && input.charAt(i)  == ')'){
                if(storeBraces.peek() == "("){
                    storeBraces.pop();
                    storeInvalidIndex.pop();
                    maxValidParanthesisLength = Math.max(maxValidParanthesisLength, i - storeInvalidIndex.peek());
                }
            }
            else if (storeBraces.isEmpty() && input.charAt(i)  == ')'){
                storeInvalidIndex.add(i);
            }
        }
        System.out.println("maxValidParanthesisLength: " + maxValidParanthesisLength);
    }
}
