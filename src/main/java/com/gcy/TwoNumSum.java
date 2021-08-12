package com.gcy;

import java.util.HashMap;

/**
 * @author chaoyoo
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 *  
 */
public class TwoNumSum {
    public int[] getIndex(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[0];
        int[] res = {};
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    if (i!=j)return res;
                }
            }
        }
        return res;
    }

    public int[] getIndexByHash(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[0];
        HashMap<Integer, Integer> map = new HashMap<>(10);
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            if (map.containsKey(target-a))return new int[]{i, map.get(target - a)};
            map.put(a, i);
        }
        return new int[0];
    }
}
