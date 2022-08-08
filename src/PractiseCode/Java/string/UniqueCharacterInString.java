package PractiseCode.Java.string;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class UniqueCharacterInString {
    public static void main(String[] args){
        Scanner continueProgramInputSC;
        do {
            System.out.println("Enter some string: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            Hashtable<Character, Integer> hashtable = new Hashtable<>();

            char[] charArray = input.toCharArray();
            for (char c : charArray) {
                if (hashtable.containsKey(c)) {
                    hashtable.put(c, hashtable.get(c) + 1);
                } else {
                    hashtable.put(c, 1);
                }
            }

            AtomicBoolean isMatched = new AtomicBoolean(true);
            hashtable.forEach((k, v) -> {
                if (v.intValue() > 1) {
                    isMatched.set(true);
                } else {
                    isMatched.set(false);
                }
            });

            if (isMatched.get()) {
                System.out.println("Not a unique character String");
            } else {
                System.out.println("Unique character String");
            }

            System.out.println("Want to continue? true or false");
            continueProgramInputSC = new Scanner(System.in);

        } while(continueProgramInputSC.nextLine().equalsIgnoreCase("true"));
    }
}
