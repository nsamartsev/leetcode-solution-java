package leetcode.easy.array;

public class MoveZeros_283 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 12};
//        int[] arr = new int[]{1};
//        int[] arr = new int[]{1,0};
//        int[] arr = new int[]{0,1};
//        int[] arr = new int[]{1,0,1};
        moveZeroes(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void moveZeroes(int[] nums) {
        int len = nums.length;

        int j = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[j] = nums[i];
                nums[j] = tmp;
                j++;
            }
        }

        while (j < len) {
            nums[j] = 0;
            j++;
        }
    }
}
