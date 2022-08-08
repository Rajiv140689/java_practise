package PractiseCode.Java.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args){
//        String s = "pwwekwb";
        String s = "dvdf";
//        String s = "abcd";
        int n = s.length(), longestSubstringLength = 0;
        Map<Character, Integer> charPositionMap = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int currentCharLocation = 0, startCharLocation = 0; currentCharLocation < n; currentCharLocation++) {

            if (charPositionMap.containsKey(s.charAt(currentCharLocation))) {
                //get the location of the char which exist already
                //here dvdf - we try to get the position for first d + 1 -> which we story in our map
                startCharLocation = Math.max(charPositionMap.get(s.charAt(currentCharLocation)), startCharLocation);
            }

            longestSubstringLength = Math.max(longestSubstringLength, currentCharLocation - startCharLocation + 1);

            charPositionMap.put(s.charAt(currentCharLocation), currentCharLocation + 1);
        }
        System.out.println("longestSubstring length: "+ longestSubstringLength);
    }
}

//d v d f
//0 1 2 3
// 3 - 1 = 2 + 1 = 3