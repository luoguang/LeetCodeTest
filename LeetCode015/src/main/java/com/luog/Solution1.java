package com.luog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        sortNums(nums);

        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int i = 0;
        int j = i + 1;
        while (i < nums.length - 2) {
            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                j = i + 1;
                continue;
            }

            int kVal = 0 - nums[i] - nums[j];
            int k = map.getOrDefault(kVal, -1);
            if (k > j) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(kVal);
                result.add(list);
            }

            while (nums[j] == nums[j + 1] && j < nums.length - 2) {
                j++;
            }

            if (j == nums.length - 2) {
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }

        return result;
    }

    private void sortNums(int[] nums) {
        if (nums == null) {
            nums = new int[10];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
