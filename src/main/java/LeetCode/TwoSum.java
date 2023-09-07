package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

        public static void main(String[] args) {
            int[] nums = {2, 5, 5, 11};
            int target = 10;
            int[] result = twoSum(nums, target);
            for (int w : result) {
                System.out.print(w + " ");
            }
        }

        public static int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
            return result;
        }


        
        
        
        
        
        
        
        
        
        
        
        
    }
