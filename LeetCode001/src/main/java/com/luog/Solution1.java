package com.luog;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        // nums[i]+nums[j]=target,即nums[j]=target-nums[i]
        // 只需要判定nums[j]在数组中即可
        // 借助HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int anotherNum = target - nums[i];
            if (map.containsKey(anotherNum)) {
                result[0] = map.get(anotherNum);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}
