package PractiseCode.Java.Map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //It consume the value but cursor is not moved to next line
        System.out.println("n: "+n);

        in.nextLine(); //Consuming the whole line and moving the cursor to next line
        for(int i=0; i<n; i++)
        {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s = in.nextLine();
            System.out.println(s);
        }

        /*This issue occurs because, when nextInt() method of Scanner class is used to read the integer value, as
        expected. But the cursor, after reading integer, remains just after it.
        How to solve this issue?

        This issue can be solved by either of the following two ways:
        1. reading the complete line for the integer and converting it to an integer, or
        Read the complete line as String and convert it to integer
        int var = Integer.parseInt(sc.nextLine());

        2. by consuming the leftover new line using the nextLine() method.
        Read the integer
        int var = sc.nextInt();

        Read the leftover new line
        sc.nextLine()
         */
    }
}

/*
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
 */



//    public static void main(String [] args) throws Exception {
//        /* Read input and save as entries in a HashMap */
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.valueOf(br.readLine());
//
//        HashMap<String, Integer> namePhoneHashMap = new HashMap<>();
//
//        while (n-- > 0) {
//            String name = br.readLine();
//            int phone   = Integer.valueOf(br.readLine());
//
//            namePhoneHashMap.put(name, phone);
//        }
//
//        /* Read each query and check if its in our HashMap */
//        String s;
//        while((s = br.readLine()) != null) {
//            if (namePhoneHashMap.containsKey(s)) {
//                System.out.println(s + "=" + namePhoneHashMap.get(s));
//            } else {
//                System.out.println("Not found");
//            }
//        }
//
//        br.close();
//    }