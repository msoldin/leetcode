package de.msoldin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q6_ZigZagConversion_Test {

    @Test
    public void exampleOne() {
        //given
        String inputOne = "PAYPALISHIRING";
        int inputTwo = 3;

        //when
        String result = Q6_ZigZagConversion.convert(inputOne, inputTwo);

        //then
        Assertions.assertThat(result).isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    public void exampleTwo() {
        //given
        String inputOne = "PAYPALISHIRING";
        int inputTwo = 4;

        //when
        String result = Q6_ZigZagConversion.convert(inputOne, inputTwo);

        //then
        Assertions.assertThat(result).isEqualTo("PINALSIGYAHRPI");
    }

    @Test
    public void exampleThree() {
        //given
        String inputOne = "A";
        int inputTwo = 1;

        //when
        String result = Q6_ZigZagConversion.convert(inputOne, inputTwo);

        //then
        Assertions.assertThat(result).isEqualTo("A");
    }



}
