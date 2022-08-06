package PractiseCode.Java.StackAndQueue;

import java.util.Iterator;
import java.util.Stack;

public class UnderstandStackMethods {
    public static void main(String[] args)
    {
        // Default initialization of Stack
        Stack<Integer> stack1 = new Stack();
        Stack stack2 = new Stack();

        //add() and push() method is same it adds the data at stack's top
        //only difference is add return true and push return the object which you are pushing

        stack1.add(1);
        stack1.add(2);
        stack1.add(3);
        stack1.add(4);

        System.out.println(stack1);
        System.out.println("stack1.peek(): " + stack1.peek());
        System.out.println("stack1.pop(): " + stack1.pop());
        System.out.println(stack1);

        System.out.println("====================================");

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);

        System.out.println(stack2);
        System.out.println("stack2.peek(): " + stack2.peek());
        System.out.println("stack2.pop(): " + stack2.pop());
        System.out.println(stack2);

        System.out.println("====================================");

        // 1. Using an iterator to iterate through a stack
        Iterator<Integer> itr = stack1.iterator();

        // hasNext() returns true if the stack has more elements
        while (itr.hasNext())
        {
            // next() returns the next element in the iteration
            System.out.println(itr.next());
        }


        // 2. Using enhanced for-loop (uses Iterator internally)
        for (Integer item: stack1) {
            System.out.println(item);
        }


        // 3. Java 8 – get the stream and use a lambda expression
        stack1.stream().forEach(S -> System.out.println(S));
    }
}
