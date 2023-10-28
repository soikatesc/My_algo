package slidingwindow;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int p1 = 0;
        int p2 = 1;

        int max_profit = 0;

        while (p2 < n) {
            if (prices[p1] > prices[p2]) {
                p1 = p2;
                p2++;
            } else {
                int currProfit = prices[p2] - prices[p1];
                max_profit = Math.max(max_profit, currProfit);
                p2++;
            }
        }

        return max_profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        int[] prices = { 7,1,5,3,6,4 };
        obj.maxProfit(prices);
    }
}
