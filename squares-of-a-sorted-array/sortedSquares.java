import java.util.Arrays;

public class Main {

        public static void main(String[] args) {

                int[] num1 = { -4, -1, 0, 3, 10 };
                int[] num2 = { -7, -3, 2, 3, 11 };
                System.out.println(Arrays.toString(sortedSquares(num1)));
                System.out.println(Arrays.toString(sortedSquares(num2)));
                System.out.println(Arrays.toString(sortedSquares2(num1)));
                System.out.println(Arrays.toString(sortedSquares2(num2)));
        }

        static int[] sortedSquares(int[] nums) {
                int[] result= new int[nums.length];
                for(int i=0; i<nums.length; i++){
                        result[i]=nums[i]*nums[i];
                }
                Arrays.sort(result);
                return result;
        };
        static int[] sortedSquares2(int[] nums) {
                int leftPointer=0;
                int rightPointer=nums.length-1;
                int index=nums.length-1;
                int[] result= new int[nums.length];

                while(leftPointer<=rightPointer){

                        if(Math.abs(nums[leftPointer])<Math.abs(nums[rightPointer])){
                                result[index]=Math.abs(nums[rightPointer])*Math.abs(nums[rightPointer]);
                                rightPointer-=1;
                        } else {
                                result[index]=Math.abs(nums[leftPointer])*Math.abs(nums[leftPointer]);
                                leftPointer +=1;
                        }
                        index--;
                }
                return result;
        };

}

