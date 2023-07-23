package leetcode.easy.string;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/">link</a>
 */
public class MergeSortedArray_88 {

    public static void main(String[] args) {

    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int start_index = m;
            int end_index = (m + n) - 1;

            int i = 0;
            while (start_index <= end_index) {
                nums1[start_index] = nums2[i];
                start_index++;
                i++;
            }

            Arrays.sort(nums1);
        }
    }
}
