package PractiseCode.Java.StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

//refer youtube video: https://www.youtube.com/watch?v=r0-zx5ejdq0
public class LongestValidParanthesis {
    public static void main(String[] args) {
        System.out.println("Enter paranthesis String: ");
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String input = "()))((()))";
//        String input = "()))((())";
        String input = ")()))((())))";

        //In storeOpeningAndInvalidParanthesisIndex we will store opening braces index and invalid closing brace index
        Stack<Integer> storeOpeningAndInvalidParanthesisIndex = new Stack();
        //In starting, we will store -1 in the stack to get the length for first valid parenthesis
        // ex: ( ) ( ( ) ) ) ( ( ( )  )   )
        //     0 1 2 3 4 5 6 7 8 9 10 11 12
        //storeOpeningAndInvalidParanthesisIndex = [-1, 0]
        // at 1 we received ) we will check opening paranthesis, if yes then pop and calculate the length
        //storeOpeningAndInvalidParanthesisIndex = [-1, 2, 3]
        // at 4 storeOpeningAndInvalidParanthesisIndex = [-1, 2]
        // at 5 storeOpeningAndInvalidParanthesisIndex = [-1]
        // at 6 storeOpeningAndInvalidParanthesisIndex = [-1, 6] and so on

        storeOpeningAndInvalidParanthesisIndex.push(-1);
        int maxValidParanthesisLength = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '(') {
                storeOpeningAndInvalidParanthesisIndex.push(i);
            }
            else if (!storeOpeningAndInvalidParanthesisIndex.isEmpty() && input.charAt(i)  == ')'){
                if(storeOpeningAndInvalidParanthesisIndex.peek() != -1 && input.charAt(storeOpeningAndInvalidParanthesisIndex.peek()) == '('){
                    storeOpeningAndInvalidParanthesisIndex.pop();
                    maxValidParanthesisLength = Math.max(maxValidParanthesisLength, i - storeOpeningAndInvalidParanthesisIndex.peek());
                }
                else{
                    //Store the index for invalid paranthesis <single ')'>
                    storeOpeningAndInvalidParanthesisIndex.push(i);
                }
            }
        }
        System.out.println("maxValidParanthesisLength: " + maxValidParanthesisLength);
    }
}
