
public class Main {

        public static void main(String[] args) {

                int[] num1 = { -1, 0, 3, 5, 9, 12 };
                int target1 = 9;
                int[] num2 = { -1, 0, 3, 5, 9, 12 };
                int target2 = 2;
                System.out.println(search1(num1, target1));
                System.out.println(search1(num2, target2));
        }

        static int search1(int[] nums, int target) {
                int left = 0;
                int right = nums.length - 1;
                while (left <= right) {

                        int mid = left + (right - left) / 2;
                        if (nums[mid] == target) {
                                return mid;
                        } else if (target > nums[mid]) {
                                left = mid + 1;
                        } else {
                                right = mid - 1;
                        }
                }
                return -1;
        };

}
