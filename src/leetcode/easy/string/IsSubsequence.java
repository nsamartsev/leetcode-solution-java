package leetcode.easy.string;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
        System.out.println(new IsSubsequence().isSubsequence("axc", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
            return true;

        int s_pointer = 0;
        int s_len = s.length();
        int t_len = t.length();
        for (int i = 0; i < t_len; i++) {
            if (t.charAt(i) == s.charAt(s_pointer)) {
                s_pointer++;
                if (s_pointer == s_len) {
                    return true;
                }
            }
        }
        return false;
    }
}
