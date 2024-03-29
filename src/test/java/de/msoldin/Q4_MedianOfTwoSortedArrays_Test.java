package de.msoldin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q4_MedianOfTwoSortedArrays_Test {

    @Test
    public void exampleOne_findMedianSortedArrays() {
        //given
        int[] inputOne = {1, 3};
        int[] inputTwo = {2};

        //when
        double result = Q4_MedianOfTwoSortedArrays.findMedianSortedArrays(inputOne, inputTwo);

        //then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void exampleTwo_findMedianSortedArrays() {
        //given
        int[] inputOne = {1, 2};
        int[] inputTwo = {3, 4};

        //when
        double result = Q4_MedianOfTwoSortedArrays.findMedianSortedArrays(inputOne, inputTwo);

        //then
        Assertions.assertThat(result).isEqualTo(2.5);
    }

    @Test
    public void exampleThree_findMedianSortedArrays() {
        //given
        int[] inputOne = {1, 2, 7, 8, 9, 10};
        int[] inputTwo = {1, 3, 4, 5, 6, 21};

        //when
        double result = Q4_MedianOfTwoSortedArrays.findMedianSortedArrays(inputOne, inputTwo);

        //then
        Assertions.assertThat(result).isEqualTo(5.5);
    }


}
