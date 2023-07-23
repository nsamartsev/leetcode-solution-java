package leetcode.medium.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram_49 {
    public static void main(String[] args) {
        var solution = new Solution();
        String[] sa = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = solution.groupAnagrams(sa);
        System.out.println(lists);
    }

    static class Solution {

        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> res = new ArrayList<>();


            Map<String, List<String>> map = new HashMap<>();
            for (String s : strs) {
                char[] key = s.toCharArray();
                Arrays.sort(key);
                map.computeIfAbsent(new String(key), k -> new ArrayList<>()).add(s);
            }

            for (Map.Entry<String, List<String>> en : map.entrySet()) {
                res.add(en.getValue());
            }

            return res;
        }
    }


}
