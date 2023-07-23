package leetcode.easy.hashmap.find_anagram_mappings_760;

import java.util.HashMap;
import java.util.Map;

public class Solution {
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
