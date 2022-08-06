package PractiseCode.Java;

//public class ReverseWord {
//    public static void main (String[] args) {
//
//        String str = "Geeks", nstr = "";
//        char ch;
//
//        System.out.print("Original word: ");
//        System.out.println("Geeks"); //Example word
//
//        for (int i = 0; i < str.length(); i++) {
//            ch = str.charAt(i); //extracts each character
//            nstr = ch + nstr; //adds each character in front of the existing string
//        }
//        System.out.println("Reversed word: " + nstr);
//
//        nstr = "";
//        for (int i = str.length()-1; i >=0 ; i--) {
//            ch = str.charAt(i); //extracts each character
//            nstr = nstr + ch; //adds each character in front of the existing string
//        }
//        System.out.println("Reversed word: " + nstr);
//    }
//}


class Solution {
    public static boolean buddyStrings(String s, String goal) {
        String sRev="";
        for (int i = s.length()-1; i >= 0; i--) {
            sRev = sRev + s.charAt(i);
        }
        System.out.println("sRev: "+sRev);
        System.out.println("goal: "+goal);
        if(sRev.equals(goal)){
            System.out.println("return true");
            return true;
        }
        else {return false;}
    }

    public static void main(String[] args){
        String s = "ab";
        String goal = "ba";
        boolean result = buddyStrings(s, goal);
        if(result)
            System.out.print("true");
        else
            System.out.print("false");
    }
}
