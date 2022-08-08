package PractiseCode.Java.string;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        String inputString = new Scanner(System.in).next();

        System.out.println("compressed string: "+ compressString(inputString));
    }

//    public static String compressString(String inputString){
    public static StringBuffer compressString(String inputString){
//        String compressedString = "";
        StringBuffer compressedString = new StringBuffer();

        for(int i = 0; i < inputString.length(); i++){
//            compressedString += inputString.charAt(i);
            compressedString.append(inputString.charAt(i));
            int count = 0;
            while(i < inputString.length() -1 && inputString.charAt(i) == inputString.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 0) {
//                compressedString += count;
                compressedString.append(inputString.charAt(i));
            }
        }
        return compressedString;
    }
}
