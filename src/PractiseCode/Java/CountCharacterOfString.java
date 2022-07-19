package PractiseCode.Java;

import java.util.HashMap;

public class CountCharacterOfString {
    public static void main(String[] args) {
        String input = "Hello Baby Avyan, Hello Baby Gauri";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] inputCharArr = input.toCharArray();
        for(char s : inputCharArr){
            if(charCountMap.containsKey(s)){
                charCountMap.put(s, charCountMap.get(s)+1);
            } else{
                charCountMap.put(s, 1);
            }
        }

        System.out.println("output "+charCountMap);
    }
}
