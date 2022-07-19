package PractiseCode.Java.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Input: exp = “([{}])”
//Output: Balanced
//
//Input: exp = “[{()}”
//Output: Not Balanced

public class BalancedParanthesisForAllBracesTypes {
    public static void main(String[] args) {
        System.out.println("Enter the paranthesis: ");
        Scanner sc  = new Scanner(System.in);
        String inputString = sc.nextLine();

        boolean isBalanced = checkIsBalanced(inputString);
        if(isBalanced){
            System.out.println("Balanced paranthesis: " + inputString);
        } else{
            System.out.println("UnBalanced paranthesis: " + inputString);
        }
    }

    private static boolean checkIsBalanced(String inputString){
        int len = inputString.length();
        Deque<Character> storeOpeningParanthesis = new ArrayDeque<>();
        for(int i = 0; i < len; i++){
            if(inputString.charAt(i) == '{' || inputString.charAt(i) == '(' || inputString.charAt(i) == '['){
                storeOpeningParanthesis.add(inputString.charAt(i));
            }
            else{
                char c = inputString.charAt(i);
                if(storeOpeningParanthesis.isEmpty()){
                    return false;
                }
                char lastChar = storeOpeningParanthesis.peekLast();
                switch(c) {
                    case ')' :
                        if (lastChar == '('){
                            storeOpeningParanthesis.pollLast();
                        }
                        else {
                            return false;
                        }
                        break;
                    case ']' :
                        if (lastChar == '['){
                            storeOpeningParanthesis.pollLast();
                        }
                        else
                            return false;
                        break;
                    case '}' :
                        if (lastChar == '{'){
                            storeOpeningParanthesis.pollLast();
                        }
                        else
                            return false;
                        break;
                    default:
                        return false;
                }
            }
        }

        return storeOpeningParanthesis.isEmpty();
    }
}
