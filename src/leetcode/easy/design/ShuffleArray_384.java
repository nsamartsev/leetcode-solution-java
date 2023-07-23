package leetcode.easy.design;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ShuffleArray_384 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] originalArray = {0,1,2,3,4,5,6,7,8,9};
        solution.shuffle(originalArray);

        System.out.print("Shuffled array: ");
        for (int index: originalArray) {
            System.out.print(index + " ");
        }

        System.out.println();
        int[] original = solution.reset();
        System.out.print("Get original array: ");
        for (int index: original) {
            System.out.print(index + " ");
        }

    }

    static class Solution {
        private static Random rand = new Random();
        private int[] original;

        public void shuffle (int[] array) {
            original = array.clone();

            List<Integer> arrayList = Arrays.stream(array).boxed().collect(Collectors.toList());

            for (int i = 0; i < array.length; i++) {
                int removeIndex = rand.nextInt(arrayList.size());
                array[i] = arrayList.get(removeIndex); //
                arrayList.remove(removeIndex);
            }
        }

        public int[] reset() {
            return original;
        }
    }
}
