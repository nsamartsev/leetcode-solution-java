package leetcode.easy.math;

public class MySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }

    public static int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        int l = 0;
        int h = x;
        int r = 0;
        while (h - l > 0.00001) {
            r = (h + l) / 2;
            int r2 = r * r;
            if (r2 == x) {
                break;
            }
            if (r2 >= x) {
                h = r;
            } else {
                l = r;
            }
        }
        return r;
    }

}
