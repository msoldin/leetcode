package de.msoldin;

public class Q4_MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        while (i + j < nums3.length) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    nums3[i + j] = nums1[i++];
                } else {
                    nums3[i + j] = nums2[j++];
                }
            } else if (i < nums1.length) {
                nums3[i + j] = nums1[i++];
            } else {
                nums3[i + j] = nums2[j++];
            }
        }

        if (nums3.length % 2 != 0) {
            return nums3[nums3.length / 2];
        } else {
            return (double) (nums3[(nums3.length - 1) / 2] + nums3[(nums3.length + 1) / 2]) / 2;
        }
    }

}
