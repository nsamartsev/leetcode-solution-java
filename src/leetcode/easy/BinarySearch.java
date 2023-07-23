package leetcode.easy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{5};
//        int[] arr = new int[]{-1,0,3,5,9,12};

        System.out.println(search(arr, 5));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i <= nums.length/2; i++) {
            int middle = (left + right - 1) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            }
            if (nums[middle] > target) {
                right = middle - 1;
            }
        }

        return -1;
    }
}
