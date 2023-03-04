import java.text.Format;
/* Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivExample 1:

Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11
Example 2:

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.
Example 3:

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0ot index. If no such index exists, return -1. */

public class Main {
        static int pivotIndex(int[] nums) {
                int result = -1;
                for (int i = 0; i < nums.length; i++) {
                        int tempLeftSum = 0;
                        int tempRightSum = 0;
                        for (int l = i - 1; l > -1; l--) {
                                tempLeftSum += nums[l];
                        }
                        for (int r = i + 1; r < nums.length; r++) {
                                tempRightSum += nums[r];
                        }

                        if (tempLeftSum == tempRightSum) {
                                result = i;
                                break;
                        }

                }
                return result;
        }

        // Solution 2
        static int pivotIndex2(int[] nums) {
                int totalSum = 0;
                int leftSum = 0;

                for (int i : nums) {
                        totalSum += i;
                }

                for (int i = 0; i < nums.length; i++) {
                        if (leftSum == totalSum - leftSum - nums[i]) {
                                return i;
                        }

                        leftSum += nums[i];

                }
                return -1;
        }

        public static void main(String[] args) {
                int[] num1 = { 1, 7, 3, 6, 5, 6 };
                int[] num2 = { 1, 2, 3 };
                System.out.println(pivotIndex(num1));
                System.out.println(pivotIndex(num2));
                System.out.println(pivotIndex2(num1));
                System.out.println(pivotIndex2(num2));
        };

}
