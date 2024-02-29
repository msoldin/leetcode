package de.msoldin;

public class Q7_ReverseInteger {

    public static int reverse(int x) {
        int leftover = x;
        int reverse = 0;

        while(leftover != 0) {
            int remainder = leftover % 10;
            reverse = reverse * 10 + remainder;
            leftover /= 10;
        }

        return reverse;
    }


}
