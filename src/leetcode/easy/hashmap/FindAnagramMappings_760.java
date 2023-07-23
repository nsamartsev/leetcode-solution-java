package leetcode.easy.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * <a href="https://leetcode.com/problems/find-anagram-mappings/">url</a>
 */

public class FindAnagramMappings_760 {
    public static void main(String[] args) {
        var solution = new Solution();
        assert Arrays.equals(solution.findMapping(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28}), new int[]{1, 4, 3, 2, 0});
    }

    static class Solution {
        public int[] findMapping(int[] nums1, int[] nums2) {
            int[] result = new int[nums1.length];

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums2.length; i++) {
                map.put(nums2[i], i);
            }

            for (int i = 0; i < nums1.length; i++) {
                result[i] = map.get(nums1[i]);
            }

            return result;
        }

    }
}
