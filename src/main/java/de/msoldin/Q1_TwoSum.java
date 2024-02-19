package de.msoldin;

import java.util.HashMap;
import java.util.Map;

public class Q1_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int number = nums[i];
            int neededNumber = target - number;
            if(numToIndex.get(neededNumber) != null){
                return new int[]{numToIndex.get(neededNumber), i};
            }
            numToIndex.put(number, i);
        }
        return null;
    }

}
