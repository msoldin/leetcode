package de.msoldin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q7_ReverseInteger_Test {

    @Test
    public void exampleOne() {
        //given
        int input = 123;

        //when
        int result = Q7_ReverseInteger.reverse(input);

        //then
        Assertions.assertThat(result).isEqualTo(321);
    }

    @Test
    public void exampleTwo() {
        //given
        int input = -123;

        //when
        int result = Q7_ReverseInteger.reverse(input);

        //then
        Assertions.assertThat(result).isEqualTo(-321);
    }

    @Test
    public void exampleThree() {
        //given
        int input = 120;

        //when
        int result = Q7_ReverseInteger.reverse(input);

        //then
        Assertions.assertThat(result).isEqualTo(21);
    }


}
