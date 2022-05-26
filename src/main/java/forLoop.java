import java.util.Arrays;

public class forLoop {
    public static void main (String[] args) {
        int[] x = {1, 2, 3};
        int target = 5;

        System.out.println(Arrays.toString(twoSum(x, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] finalResult = {0, 0};

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
}
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].