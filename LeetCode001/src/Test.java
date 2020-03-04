public class Test {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");

        Solution1 solution1 = new Solution1();
        int[] result1 = solution1.twoSum(nums, target);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        Solution2 solution2 = new Solution2();
        int[] result2 = solution2.twoSum(nums, target);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        Solution3 solution3 = new Solution3();
        int[] result3 = solution1.twoSum(nums, target);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");
    }
}
