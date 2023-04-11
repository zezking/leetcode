public class Main {

        public static void main(String[] args) {

                int[] num1 = { 1, 3, 5, 6 };
                int target1 = 5;
                int[] num2 = { 1, 3, 5, 6 };
                int target2 = 2;
                int[] num3 = { 1, 3, 5, 6 };
                int target3 = 7;
                System.out.println(searchInsert(num1, target1));
                System.out.println(searchInsert(num2, target2));
                System.out.println(searchInsert(num3, target3));
        }

        static int searchInsert(int[] nums, int target) {
                int left=0;
                int right=nums.length-1;

                while(left<=right){
                        int pivot=left+(right-left)/2;
                        if(nums[pivot]==target){
                                return pivot;
                        } else if(nums[pivot]<target){
                                left=pivot+1;
                        } else {
                                right=pivot-1;
                        }
                }
                return left;
        };

}
