public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        // nums[i]+nums[j]=target,即nums[j]=target-nums[i]
        // 只需要判定nums[j]在数组中即可
        for (int i = 0; i < nums.length; i++) {
            int anotherNum = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (anotherNum == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
