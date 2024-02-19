package de.msoldin;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Q3_LongestSubstringWithoutRepetingCharacters {


    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        Set<Character> currentSubstring = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentSubstring.contains(currentChar)){
                if(result < currentSubstring.size()){
                    result = currentSubstring.size();
                }
                currentSubstring.clear();
            }
            currentSubstring.add(currentChar);
        }
        return result;
    }

}
