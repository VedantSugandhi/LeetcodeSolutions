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
}
