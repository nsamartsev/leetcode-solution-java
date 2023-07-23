package leetcode.easy.binary_search;

public class BinarySearchPosition_35 {
    public static void main(String[] args) {
        var solution = new Solution();
        assert solution.searchInsert(new int[]{1,3,5,6}, 5) == 2 ;
    }

    static class Solution {
        public static int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int middle = (int) Math.floor((double) (left + right) / 2);
                if (nums[middle] < target) {
                    left = middle + 1;
                } else if (nums[middle] > target) {
                    right = middle - 1;
                } else {
                    return middle;
                }
            }

            return left;
        }
    }
}
