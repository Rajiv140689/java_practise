package PractiseCode.Java.string;

public class SwapCharString {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(swap(str,0,1));
        System.out.println(swap(str,0,str.length()-1));
    }
    static String swap(String str , int i , int j ) {
        StringBuilder strB = new StringBuilder(str);
        char l = strB.charAt(i) , r = strB.charAt(j);
        strB.setCharAt(i,r);
        strB.setCharAt(j,l);
        return strB.toString();
    }
}
