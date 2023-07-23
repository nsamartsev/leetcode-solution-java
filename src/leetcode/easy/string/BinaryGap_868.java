package leetcode.easy.string;

/**
 * @url: <a href="https://leetcode.com/problems/binary-gap/">link</a>
 */
public class BinaryGap_868 {
    public static void main(String[] args) {
        var solution = new BinaryGap_868();
        assert solution.binaryGap(22) == 2;
        assert solution.binaryGap(8) == 0;
        assert solution.binaryGap(6) == 1;
    }

    public int binaryGap(int N) {
        String nStr = Integer.toBinaryString(N);
        int nStrLen = nStr.length();

        int maxGapSize = 0;
        int indexOne = nStr.indexOf('1');

        for (int i = 1; i < nStrLen; i++) {
            char symbol = nStr.charAt(i);
            if (symbol == '1') {
                maxGapSize = Math.max(maxGapSize, i - indexOne);
                indexOne = i;
            }
        }

        return maxGapSize;
    }

}
