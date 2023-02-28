/* Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
example 1:

input: nums = [1,2,3,4]
output: [1,3,6,10]
explanation: running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
example 2:

input: nums = [1,1,1,1,1]
output: [1,2,3,4,5]
explanation: running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
example 3:

input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17] */
 class Solution {
        public int[] runningSum(int[] nums) {
                int[] result;
                int sum;
                result = new int[nums.length];
                for (int i = 0; i < nums.length; i++) {
                        sum = nums[i];
                        for (int j = 0; j < i; j++) {
                                sum += nums[j];
                        }
                                result[i] = sum;
                }
                return result;
        }
}
