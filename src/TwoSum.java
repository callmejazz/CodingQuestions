//Write a function that takes in a non-empty array of distinct integers and an
//        integer representing a target sum. If any two numbers in the input array sum
//        up to the target sum, the function should return them in an array, in any
//        order. If no two numbers sum up to the target sum, the function should return
//        an empty array.
// Note that the target sum has to be obtained by summing two different integers
//          in the array; you can't add a single integer to itself in order to obtain the
//          target sum.

//I usually try to approach the problem step by step with psudo code followed by real code.

import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
//I will use a HashSet of integers
        Set<Integer> numbers = new HashSet<>();
        //now I will make a for loop to go through the array and I need to store the variable
        for (int num : numbers) {
            //this to store the number starting from the end of the Set
            int possibleMatch = targetSum - 1;
            if (numbers.contains(possibleMatch)) {
                return new int[]{possibleMatch, num};
            } else {
                numbers.add(num);
            }
        }
        return new int[0];
    }
}
