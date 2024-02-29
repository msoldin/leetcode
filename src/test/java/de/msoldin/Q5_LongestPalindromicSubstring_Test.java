package de.msoldin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q5_LongestPalindromicSubstring_Test {


    @Test
    public void exampleOne() {
        //given
        String input = "babad";

        //when
        String result = Q5_LongestPalindromicSubstring.longestPalindrome(input);

        //then
        Assertions.assertThat(result).isEqualTo("bab");
    }

    @Test
    public void exampleTwo() {
        //given
        String input = "cbbd";

        //when
        String result = Q5_LongestPalindromicSubstring.longestPalindrome(input);

        //then
        Assertions.assertThat(result).isEqualTo("bb");
    }

}
