public class Main {

        // brute force solution but will have timeout error.
        static int maxProfit(int[] nums) {

                int maxProfit = 0;
                for (int i = 0; i < nums.length - 1; i++) {
                        for (int j = i + 1; j < nums.length; j++) {
                                int profit = nums[j] - nums[i];
                                if (profit > maxProfit) {
                                        maxProfit = profit;
                                }
                        }
                }
                return maxProfit;
        }

        public static void main(String[] args) {
                int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
                int[] prices2 = new int[] { 7, 6, 4, 3, 1 };
                System.out.println(maxProfit(prices));
                System.out.println(maxProfit(prices2));
        };
}
