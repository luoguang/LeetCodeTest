public class Test {
    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        int numRows = 3;

        Solution solution = new Solution();
        String result = solution.convert(s, numRows);

        System.out.println(result);

        Solution1 solution1 = new Solution1();
        String result1 = solution1.convert(s, numRows);

        System.out.println(result1);

        Solution1 solution2 = new Solution1();
        String result2 = solution.convert(s, numRows);

        System.out.println(result2);
    }
}
