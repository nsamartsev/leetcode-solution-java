package leetcode.easy.math;

import java.math.BigInteger;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("11", "1"));
        System.out.println(new AddBinary().addBinary("1010", "1011"));
        System.out.println(new AddBinary().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }

    public String addBinary(String a, String b) {
        int radix = 2;
        BigInteger a1 = new BigInteger(a, radix);
        BigInteger b1 = new BigInteger(b, radix);
        return a1.add(b1).toString(radix);
    }

}
