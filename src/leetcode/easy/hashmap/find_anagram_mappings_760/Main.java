package leetcode.easy.hashmap.find_anagram_mappings_760;

import java.util.Arrays;

/**
 * @Title 760. Find Anagram Mappings
 * @Level: Medium
 * @Url <a href="https://leetcode.com/problems/find-anagram-mappings/">Leetcode</a>
 * @Author  Nikita Samartsev
 */

public class Main {
    public static void main(String[] args) {
        var solution = new Solution();
        assert Arrays.equals(solution.findMapping(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28}), new int[]{1, 4, 3, 2, 0});
    }
}
