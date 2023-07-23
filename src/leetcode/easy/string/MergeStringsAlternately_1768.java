package leetcode.easy.string;

public class MergeStringsAlternately_1768 {
    public static void main(String[] args) {
//        String s = mergeAlternately("abc", "pqr");
//        String s = mergeAlternately("ab", "pqrs");
//        System.out.println(s);

        System.out.println(-12 % 5);
        System.out.println(-11 / 10);
        System.out.println(-11 % 10);


//        print(-12 // 5)
//                print(-12 % 5)
//                print(-11 / 10)
//                print(-11 // 10)
//                        print(-11 % 10)
    }

    public static String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0, j = 0; i < word1Len || j < word2Len; i++, j++) {
            if (i < word1Len && word1.charAt(i) != ' ') {
                result.append(word1.charAt(i));
            }
            if (j < word2Len && word2.charAt(j) != ' ') {
                result.append(word2.charAt(j));
            }
        }
        return result.toString();
    }
}
