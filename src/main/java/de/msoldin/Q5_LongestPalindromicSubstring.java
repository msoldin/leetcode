package de.msoldin;

public class Q5_LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        //String longestPalindrome = "";
        //for (int i = 0; i < s.length(); i++) {
        //    for (int j = i; j < s.length(); j++) {
        //        String substring = s.substring(i, j);
        //        String reversed = reverse(substring);
        //        if (substring.equals(reversed) && substring.length() > longestPalindrome.length()) {
        //            longestPalindrome = substring;
        //        }
        //    }
        //
        //}
        //return longestPalindrome;
        int left = 0;
        int right = s.length() -1;
        while (left != right){
            String substring = s.substring(left, right);
            String reversed = reverse(substring);
            if (substring.equals(reversed)) {
                return substring;
            }
            left++;
            right--;
        }

        return "";
    }

    public static String reverse(String s) {
        char[] string = s.toCharArray();
        char[] reversed = new char[string.length];
        int begin = 0;
        int end = string.length - 1;
        for (; end >= 0; end--) {
            reversed[begin++] = string[end];
        }
        return new String(reversed);
    }

}
