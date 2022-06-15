import java.util.ArrayList;
import java.util.Arrays;

public class forLoop {
    public static void main(String[] args) {
//        int[] x = {1, 2, 3};
//        int target = 5;
//        System.out.println(Arrays.toString(twoSum(x, target)));
        //^^^^ Prints out [1, 2]

//        int[] x = {1, 1, 1, 1, 1};
//        System.out.println(Arrays.toString(runningSum(x)));
        //^^^^^ Prints out [1, 2, 3, 4, 5]

        System.out.println(isPalindrome(121)); // prints true
        System.out.println(isPalindrome(1234)); // prints false

    }

    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    private static int[] twoSum(int[] nums, int target) {
        int[] finalResult = {};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if ((j != i) && (nums[i] + nums[j] == target)) {
                    finalResult[0] = i;
                    finalResult[1] = j;
                    return finalResult;
                }
            }
        }
        return finalResult;
    }

    //    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//    Return the running sum of nums.
    public static int[] runningSum(int[] nums) {
        // nums[] = [1, 2, 3, 4]
        // return[] = [1, 3, 6, 10]
        int[] returnArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                returnArray[i] = nums[i];
            } else {
                returnArray[i] = nums[i] + returnArray[i - 1];
            }
        }
        return returnArray;
    }

    //    Given an integer x, return true if x is palindrome integer.
//    i.e. return true for 121
    public static boolean isPalindrome(int x) {
        int input = x;
        int reversedNum = 0;

        while (x > 0) {
            int lastNumber = x % 10;  // this returns the final number of the int
            reversedNum = (reversedNum * 10) + lastNumber; // this adds a 0 to the end of reversedNum, then adds lastNum
            x = x / 10; // removes final number in original int, and shunts everything to the right one place.
        }
        return reversedNum == input;
    }

}
