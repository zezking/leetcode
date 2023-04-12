import java.util.Arrays;

public class Main {

        public static void main(String[] args) {

                int[] num1 = { 0, 1, 0, 3, 12 };
                int[] num2 = { 0 };
                moveZeros(num1);
                moveZeros(num2);
        }

        static void moveZeros(int[] nums) {
                int lastNoneZeroIndex = 0;

                for (int i = 0; i < nums.length; i++) {

                        if (nums[i] != 0) {

                                nums[lastNoneZeroIndex++] = nums[i];
                        }
                }

                for (int i = lastNoneZeroIndex; i < nums.length; i++) {
                        nums[i] = 0;
                }

                System.out.println(Arrays.toString(nums));
        };

}
