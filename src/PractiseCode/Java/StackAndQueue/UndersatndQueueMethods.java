package PractiseCode.Java.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class UndersatndQueueMethods {
    public static void main(String[] args) {
        // Creating and initializing deque
        // Declaring object of integer type
        Deque<Integer> de_que = new ArrayDeque<Integer>(10);
        Deque<Integer> de_que1 = new ArrayDeque<Integer>(10);

        // Operations 1
        // add() method

        // Adding custom elements
        // using add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);
        de_que.push(60);
        de_que.add(70);
        de_que.add(80);
        System.out.println("de_que: " + de_que);
        System.out.println("de_que.peek(): " + de_que.peek());
        System.out.println("de_que.pop(): " + de_que.pop());

        System.out.println("de_que.peekLast(): " + de_que.peekLast());
        System.out.println("de_que.pollLast(): " + de_que.pollLast());
        System.out.println("de_que: " + de_que);
        System.out.println("=============================================");

        // Iterating using for each loop
//        for (Integer element : de_que) {
//            // Print the corresponding element
//            System.out.println("Element : " + element);
//        }

        de_que1.push(10);
        de_que1.push(20);
        de_que1.push(30);
        de_que1.push(40);
        de_que1.push(50);
        de_que1.add(60);
        de_que1.push(70);
        de_que1.push(80);

        System.out.println("de_que1: " + de_que1);
        System.out.println("de_que1.peek(): " + de_que1.peek());
        System.out.println("de_que1.pop(): " + de_que1.pop());

        System.out.println("de_que1.peekLast(): " + de_que1.peekLast());
        System.out.println("de_que1.pollLast(): " + de_que1.pollLast());
        System.out.println("de_que1: " + de_que1);
    }
}
