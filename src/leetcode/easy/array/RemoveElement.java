package leetcode.easy.array;


public class RemoveElement {
    public static void main(String[] args) {
        testCase(new int[]{3,2,2,3},3 );
        testCase(new int[]{0,1,2,2,3,0,4,2},2 );
    }

    public static void testCase(int[] nums, int val) {
        System.out.println(new RemoveElement().removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        int len = nums.length;

        int k = 0;

        for (int i = 0; i < len; ++i) {
            if (nums[i] == val) {
                continue;
            }
            nums[k] = nums[i];
            k++;
        }

        return k;
    }
}
