package de.msoldin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q3_LongestSubstringWithoutRepetingCharacters_Test {

    @Test
    public void exampleOne_lengthOfLongestSubstring(){
        //given
        String input = "abcabcbb";

        //when
        int result = Q3_LongestSubstringWithoutRepetingCharacters.lengthOfLongestSubstring(input);

        //then
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void exampleTwo_lengthOfLongestSubstring(){
        //given
        String input = "bbbbb";

        //when
        int result = Q3_LongestSubstringWithoutRepetingCharacters.lengthOfLongestSubstring(input);

        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void exampleThree_lengthOfLongestSubstring(){
        //given
        String input = "pwwkew";

        //when
        int result = Q3_LongestSubstringWithoutRepetingCharacters.lengthOfLongestSubstring(input);

        //then
        Assertions.assertThat(result).isEqualTo(3);
    }


}
