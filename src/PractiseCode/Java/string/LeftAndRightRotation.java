package PractiseCode.Java.string;

import java.util.Scanner;

public class LeftAndRightRotation {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String moveLeftTwoPosition = moveStringPosition(str, "left", 2);
        String moveRightTwoPosition = moveStringPosition(str, "right", 2);
        System.out.println("shifted string to left: " + moveLeftTwoPosition);
        System.out.println("shifted string to right: " + moveRightTwoPosition);


        //second way
        System.out.println(leftrotate(str, 2));

        System.out.println(rightrotate(str, 2));
    }


    public static String moveStringPosition(String str, String rotationType, int positionMove) {
        String rotatedString = "";
        if (rotationType.equalsIgnoreCase("left")) {
            rotatedString = str.substring((str.length() - positionMove),
                    str.length()) + str.substring(0, (str.length() - positionMove)) ;
        }
        else{
            rotatedString = str.substring((str.length() - positionMove) - 1, str.length()) + str.substring(0,
                    positionMove);
        }
        return rotatedString;
    }


    //second way
    static String leftrotate(String str, int d)
    {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }

    // function that rotates s towards right by d
    static String rightrotate(String str, int d)
    {
        return leftrotate(str, str.length() - d);
    }
}