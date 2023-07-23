package leetcode.easy.math;

import java.math.BigInteger;

/**
 * <a href="https://leetcode.com/problems/add-binary/">link</a>
 */
public class AddBinary_67 {

    public static void main(String[] args) {
        var solution = new Solution();
        assert solution.addBinary("11", "1").equals("100");
        assert solution.addBinary("1010", "1011").equals("10101");

//        System.out.println(new Solution().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
//                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    static class Solution {
        public String addBinary(String a, String b) {
            int radix = 2;
            BigInteger a1 = new BigInteger(a, radix);
            BigInteger b1 = new BigInteger(b, radix);
            return a1.add(b1).toString(radix);
        }
    }

}
