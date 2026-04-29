package Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxDiff = 0;
        for (int price : prices) {
            if (price < min)
                min = price;
            maxDiff = Math.max(maxDiff, price - min);
        }
        return maxDiff;
    }

    // Best time to buy and sell stock 2
    public int maxProfit2(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                profit += prices[i] - prices[i - 1];
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));
    }
}
