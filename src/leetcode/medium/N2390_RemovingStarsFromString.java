package leetcode.medium;

public class N2390_RemovingStarsFromString {
    public static void main(String[] args) {
        String s1 = "leet**cod*e";
//        String s1 = "erase*****";
        System.out.println(removeStars(s1));
    }
    public static String removeStars(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();

        int countStarts = 0;
        for (int i = len-1; i >= 0 ; i--) {
            if (chars[i] == '*') {
                countStarts++;
                chars[i] = ' ';
                continue;
            }
            if (countStarts != 0) {
                chars[i] = ' ';
                countStarts--;
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                str.append(chars[i]);
            }
        }

        return str.toString();
    }
}
