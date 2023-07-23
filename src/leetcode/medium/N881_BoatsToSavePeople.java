package leetcode.medium;

import java.util.Arrays;

public class N881_BoatsToSavePeople {
    public static void main(String[] args) {
//        int[] people = {3,5,3,4};
//        int limit = 5; // should return 4

//        int[] people = {1,2};
//        int limit = 3; // should return 1

//        int[] people = {5,1,4,2};
//        int limit = 6; // should return 2

        int[] people = {3,2,2,1};
        int limit = 3; // should return 3

        int count = numRescueBoats(people, limit);
        System.out.println(count);
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat_count = 0;
        int p_start = 0, p_end = people.length - 1;

        while ( p_start <= p_end ) {
            boat_count++;
            if (people[p_start] + people[p_end] <= limit) {
                p_start++;
            }
            p_end--;
        }

        return boat_count;
    }
}
