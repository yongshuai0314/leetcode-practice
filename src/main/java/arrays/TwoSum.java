package arrays;
// LeetCode 题目链接: https://leetcode.com/problems/two-sum/
// 题目描述: 给定一个整数数组 nums 和一个整数目标值 target，
// 请你在该数组中找出 和为目标值 target 的那 两个 整数，
// 并返回它们的数组下标。

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
} 