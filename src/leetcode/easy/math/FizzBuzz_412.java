package leetcode.easy.math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        List<String> strings = fizzBuzz(3);
        System.out.println(strings);
    }

    public static List<String> fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if ((i % 3) == 0 && (i % 5) == 0)
                list.add("FizzBuzz");
            else if ((i % 3) == 0)
                list.add("Fizz");
            else if ((i % 5) == 0)
                list.add("Buzz");
            else
                list.add(Integer.toString(i));
        }

        return list;
    }
}
