public class Main {

        // brute force solution but will have timeout error.
        static int maxProfit(int[] prices) {

                int maxProfit = 0;
                for (int i = 0; i < prices.length - 1; i++) {
                        for (int j = i + 1; j < prices.length; j++) {
                                int profit = prices[j] - prices[i];
                                if (profit > maxProfit) {
                                        maxProfit = profit;
                                }
                        }
                }
                return maxProfit;
        }

        // One Pass method (streaming algorithm which reads its input exactly once)
        static int maxProfit2(int[] prices) {
                int minPrice = Integer.MAX_VALUE;
                int maxProfit = 0;

                for (int i = 0; i < prices.length; i++) {

                        if (prices[i] < minPrice) {
                                minPrice = prices[i];
                        }
                        if (prices[i] - minPrice > maxProfit) {
                                maxProfit = prices[i] - minPrice;
                        }
                }

                return maxProfit;
        }

        public static void main(String[] args) {
                int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
                int[] prices2 = new int[] { 7, 6, 4, 3, 1 };
                System.out.println(maxProfit(prices));
                System.out.println(maxProfit(prices2));
                System.out.println(maxProfit2(prices));
                System.out.println(maxProfit2(prices2));
        };
}
