package leetcode.medium.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @url <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">link</a>
 */
public class TwoSum_167 {
    public static void main(String[] args) {
        assert new Solution().twoSum(new int[]{2, 7, 11, 15}, 9).equals(new int[]{1, 2});
    }

    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < numbers.length; ++i) {
                int y = target - numbers[i];
                if (map.containsKey(y)) {
                    result[1] = i + 1;
                    result[0] = map.get(y) + 1;
                    break;
                } else {
                    map.put(numbers[i], i);
                }
            }

            return result;
        }
    }
}
