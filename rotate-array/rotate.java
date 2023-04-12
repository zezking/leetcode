import java.util.Arrays;

public class Main {

        public static void main(String[] args) {

                int[] num1 = { 1, 2, 3, 4, 5, 6, 7 };
                int k1 = 3;
                int[] num2 = { -1, -100, -3, 99 };
                int k2 = 2;
                rotate(num1, k1);
                rotate(num2, k2);
        }

        static void rotate(int[] nums, int k) {

                k %= nums.length;
                int temp, previous;
                for (int i = 0; i < k; i++) {
                        previous = nums[nums.length - 1];
                        for (int j = 0; j < nums.length; j++) {
                                temp = nums[j];
                                nums[j] = previous;
                                previous = temp;
                        }
                }
                System.out.println(Arrays.toString(nums));
        };

}
