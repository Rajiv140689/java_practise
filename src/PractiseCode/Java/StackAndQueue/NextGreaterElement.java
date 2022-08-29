package PractiseCode.Java.StackAndQueue;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args){
        int[] inputArr = new int[]{5,3,2,10,6,8,1,4,12,7};
        Stack<Integer> stk = new Stack<>();
        stk.push(inputArr[0]);
        int nextBigElement = 0;
        int poppedElement = 0;

        for(int i = 1; i < inputArr.length; i++){
            nextBigElement = inputArr[i];

            if(inputArr[i] < stk.peek()){
                stk.push(inputArr[i]);
            } else {
                poppedElement = Integer.parseInt(stk.pop().toString());
                while(nextBigElement > poppedElement) {
                    System.out.println(poppedElement + " -- " + nextBigElement);
                    if (stk.isEmpty() == true || stk.peek() > nextBigElement) {
                        break;
                    }
                    poppedElement = stk.pop();
                }

                stk.push(nextBigElement);
            }
        }

        while(stk.isEmpty() == false){
            poppedElement = stk.pop();
            System.out.println(poppedElement + " -- " + null);
        }
    }
}
