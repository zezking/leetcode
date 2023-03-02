/* Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1. */
public class Main {
        static int[] pivotIndex(int[] nums) {
                int[] result = new int[nums.length];
                result[0] = nums[0];
                for (int index = 1; index < nums.length; index++) {

                        result[index] = result[index - 1] + nums[index];
                }
                return result;
        }

        public static void main(String[] args) {

                int[] nums = { 1, 7, 3, 6, 5,6 };
                System.out.println(Arrays.toString(pivotIndex(nums)));
        };

}

